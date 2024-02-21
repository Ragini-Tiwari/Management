package com.yourcompany.model;

import java.time.LocalDate;

public class Transaction {
    private int id;
    private int userId;
    private int bookId;
    private LocalDate date;

    // Constructor, getters, and setters
    public Transaction(int id, int userId, int bookId, LocalDate date) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", userId=" + userId +
                ", bookId=" + bookId +
                ", date=" + date +
                '}';
    }
}
