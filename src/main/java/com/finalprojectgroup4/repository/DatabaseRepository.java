package com.finalprojectgroup4.repository;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DatabaseRepository {

    private final Environment env;
    private static Connection connection;

    public DatabaseRepository(Environment env){
        this.env = env;
        this.setupDatabase();
    }
    private void setupDatabase() {
        try {
            String userName = env.getProperty("database.username");
            String password = env.getProperty("database.password");
            String Url = env.getProperty("datasource.url");

            assert Url != null;
            this.connection = DriverManager.getConnection( userName, password, Url);
        }catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    public Connection getConnection(){
        return connection;
    }
}