package com.sparta.aa.jdbc;

import com.sparta.aa.jdbc.util.PropertiesLoader;

import java.sql.*;
import java.util.Properties;

public class App {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO = new EmployeeDAO(ConnectionManager.createConnection());
        employeeDAO.createEmployee(10002, new Date(1960, 01, 01), "Bob", "Smith", "M", new Date(2023, 05, 12));
        employeeDAO.getAllUsers();
        ConnectionManager.closeConnection();
    }
}
