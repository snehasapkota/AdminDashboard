package com.parampara.model;

public class UserModel {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String password;

    // Constructors
    public UserModel() {}

    public UserModel(int id, String name, String email, String phone) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    // Getters & Setters
    public int getId() { 
        return id; 
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name; 
    }

    public String getEmail() {
        return email; 
    }
    
    public void setEmail(String email) { 
        this.email = email;
    }

    public String getPhone() { 
        return phone;
    }
    
    public void setPhone(String phone) { 
        this.phone = phone; 
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
