package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class PaymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentApplication.class, args);
		String url = "jdbc:sqlserver://localhost:1433;databaseName=Payment;integratedSecurity=true;trustServerCertificate=true";
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		try {
			// Load the driver
			Class.forName(driver);
			// Establish the connection
			Connection connection = DriverManager.getConnection(url);
			System.out.println("Connection successful!");
			connection.close();
		} catch (ClassNotFoundException e) {
			System.out.println("SQL Server JDBC Driver not found.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Connection failed.");
			e.printStackTrace();
		}
	}
}
