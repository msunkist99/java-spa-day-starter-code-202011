package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    @NotBlank(message="User name cannot be blank or null")
    private String username;

    @Email(message = "Invalid email format.")
    private String email;

    @Size(min=6, message="Password must be at least 6 characters.")
    private String password;
    private int id;
    private String joinDate;

    private static int nextId = 0;

    // noArg controller
    public User(){}

    // controller
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
