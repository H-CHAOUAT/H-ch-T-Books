package com.example.h2demo;

public class Books {
    // create instance variables

    private int id;
    private String title;
    private String author;
    private String publishYear;
    private String genre;
    private String description;
    private int price;

    //getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    int quantity;

    public Books(int id, String author, String title, String publishYear, String genre, int price, String description, int quantity) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publishYear = publishYear;
        this.genre = genre;
        this.price = price;
        this.description = description;
        this.quantity = quantity;

    }
}

