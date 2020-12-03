package org.launchcode.spaday.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String username;
    private String email;
    private String password;
    private int id;
    private String joinDate;

    private static int nextId = 0;

    public User(String username, String email, String password) {
        String dateFormat = "mm-dd-yyyy";
        SimpleDateFormat simpleDateForm = new SimpleDateFormat(dateFormat);

        this.username = username;
        this.email = email;
        this.password = password;
        this.joinDate = simpleDateForm.format(new Date());
        this.id = ++nextId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
