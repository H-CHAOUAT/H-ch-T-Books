package com.example.h2demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class H2DatabaseDemo {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Load H2 driver
            Class.forName("org.h2.Driver");

            // Establish a connection
            connection = DriverManager.getConnection("jdbc:h2:~/testdb", "sa", "");

            // Start the H2 Web Console
            org.h2.tools.Server.startWebServer(connection);

            // Create a statement
            statement = connection.createStatement();

            // Drop the table if it already exists
            String dropTableSQL = "DROP TABLE IF EXISTS books";
            statement.execute(dropTableSQL);


            // Create a table in the H2 database
            String createTableSQL = "CREATE TABLE books (" +
                    "id INT PRIMARY KEY, " +
                    "title VARCHAR(255), " +
                    "author VARCHAR(255), " +
                    "publisherYear VARCHAR(4), " +
                    "genre VARCHAR(255), " +
                    "description TEXT)";
            statement.execute(createTableSQL);

            // Insert data into the table
            String insertDataSQL = "INSERT INTO books (id, title, author, publisherYear, genre, description) VALUES " +
                    "(1, 'Becoming', 'Michelle Obama', '2018', 'Memoir, Non-fiction', 'Inspiring memoir of Michelle Obama''s life journey')," +
                    "(2, 'The Catcher in the Rye', 'J.D. Salinger', '1951', 'Fiction, Coming-of-Age', 'A story about teenage rebellion and alienation');";
            statement.execute(insertDataSQL);

            // Query the table and print out the data
            String selectSQL = "SELECT * FROM books";
            ResultSet resultSet = statement.executeQuery(selectSQL);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id"));
                System.out.println("Title: " + resultSet.getString("title"));
                System.out.println("Author: " + resultSet.getString("author"));
                System.out.println("Year: " + resultSet.getString("publisherYear"));
                System.out.println("Genre: " + resultSet.getString("genre"));
                System.out.println("Description: " + resultSet.getString("description"));
                System.out.println("---------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
