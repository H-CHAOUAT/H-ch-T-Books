package com.example.h2demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManager {
    private Connection connection;
    private Statement statement;

    // Constructor for initializing the connection
    public DatabaseManager() {
        try {
            // Load H2 driver
            Class.forName("org.h2.Driver");

            // Establish connection
            connection = DriverManager.getConnection("jdbc:h2:~/testdb", "sa", "");

            // Create statement
            statement = connection.createStatement();

            // Start H2 Web Console (Optional)
            org.h2.tools.Server.startWebServer(connection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to create tables
    public void createTables() {
        try {
            // Create books table
            String createBookTable = "CREATE TABLE IF NOT EXISTS books (" +
                    "id INT PRIMARY KEY, " +
                    "title VARCHAR(255), " +
                    "author VARCHAR(255), " +
                    "publishYear VARCHAR(4), " +
                    "genre VARCHAR(255), " +
                    "description TEXT, " +
                    "price INT DEFAULT 10, " +    // Missing comma added here
                    "quantity INT DEFAULT 1" +     // Closing properly without trailing comma
                    ");";

            statement.execute(createBookTable);

            // Create users table
            String createUserTable = "CREATE TABLE IF NOT EXISTS users (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(255), " +
                    "userName VARCHAR(255), " +
                    "email VARCHAR(255), " +
                    "passwordHash VARCHAR(255), " +
                    "address VARCHAR(255), " +
                    "phone VARCHAR(255)" +         // Closing properly without trailing comma
                    ");";

            statement.execute(createUserTable);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to insert a new book
    public void insertBook(Book book) {
        try {
            String insertBookSQL = "INSERT INTO books (id, title, author, publishYear, genre, description, price, quantity) VALUES (" +
                    book.getId() + ", '" + book.getTitle() + "', '" + book.getAuthor() + "', '" +
                    book.getPublisherYear() + "', '" + book.getGenre() + "', '" + book.getDescription() + "', " +
                    book.getPrice() + ", " + book.getQuantity() + ")";
            statement.execute(insertBookSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Method to insert a new user
    public void insertUser(User user) {
        try {
            String insertUserSQL = "INSERT INTO users (id, name, userName, email, passwordHash, address, phone) VALUES (" +
                    user.getUserId() + ", '" + user.getName() + "', '" + user.getUserName() + "', '" +
                    user.getEmail() + "', '" + user.getPasswordHash() + "', '" +
                    user.getAddress() + "', '" + user.getPhone() + "')";
            statement.execute(insertUserSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Close the database connection
    public void close() {
        try {
            if (statement != null) statement.close();
            if (connection != null) connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
