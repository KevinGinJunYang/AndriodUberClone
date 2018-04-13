package com.kevin.andrioduberclone.Model;

/**
 * Created by Kevin on 9/02/2018.
 */

public class User {

    private String email,passsword,name,phone;

    public User(){

    }

    public User(String email, String passsword, String name, String phone) {
        this.email = email;
        this.passsword = passsword;
        this.name = name;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasssword() {
        return passsword;
    }

    public void setPasssword(String passsword) {
        this.passsword = passsword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
