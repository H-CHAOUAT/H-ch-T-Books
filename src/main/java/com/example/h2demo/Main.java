package com.example.h2demo;

public class Main {
    public static void main(String[] args) {

        dataBaseManager();
    }

    private static void dataBaseManager() {
        // create an object
        DatabaseManager databaseManager = new DatabaseManager();

        // create tables
        databaseManager.createTables();

        // insert books
        Book book1 = new Book(1, "Michelle Obama", "Becoming", "2018","Memoires",10.99, "blablabla oh Michelle blabla", 3 );
        Book book2 = new Book(2, "Nelson Mandela ", "Long walk to freedom", "1994","Memoires",12.99, "blablabla oh Nelson blabla", 2 );

        //create an object for user
        User user1 = new User(1, "Maria Montessori", "nouvelleFemme", "nouvellefemme@nouvellefemme.fr", "password123", "Italie", "00326999999");

        // call objects
        databaseManager.insertBook(book1);
        databaseManager.insertBook(book2);
        databaseManager.insertUser(user1);

        // connection database
        databaseManager.close();
    }
}

