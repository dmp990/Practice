package com.sparta.aa.jdbc;

public interface SQLQueries {
    String SELECT_ALL = "SELECT * FROM employees.employees";
    String CREATE = "INSERT INTO employees.employees (emp_no, birth_date, first_name, last_name, gender, hire_date) VALUES (?, ?, ?, ?, ?, ?)";
}
