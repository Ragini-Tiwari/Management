package com.yourcompany.ui;

import com.yourcompany.dao.UserDAO;
import com.yourcompany.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.sql.SQLException;
import java.util.List;

public class UserController {
    @FXML
    private TableView<User> userTable;
    @FXML
    private TableColumn<User, String> nameColumn;
    @FXML
    private TableColumn<User, String> emailColumn;

    private UserDAO userDAO;

    public void initialize() {
        try {
            userDAO = new UserDAO(DBConnection.getConnection());
            loadUserData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadUserData() throws SQLException {
        List<User> users = userDAO.getAllUsers();
        userTable.getItems().addAll(users);
    }

    // Implement event handlers and other methods for user management
}
