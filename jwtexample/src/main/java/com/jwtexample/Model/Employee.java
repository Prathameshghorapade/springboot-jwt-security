package com.jwtexample.Model;




public class Employee {
    private Long id;
    private String name;
    private String department;
    private String password;

    public Employee(String pp, String s, String pratu,String password) {
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getPassword() { return password; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setPassword(String password) { this.password = password; }
}

