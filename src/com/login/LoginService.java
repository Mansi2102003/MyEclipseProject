package com.login;

public class LoginService {
    public boolean login(String username, String password) {
        if(username == null || password == null) {
            return false;
        }
        if(username.isEmpty() || password.isEmpty()) {
            return false; // Empty fields
        }
        if(username.equals("mansi@test.com") && password.equals("Test@123")) {
            return true; // valid login
        }
        if ("admin".equals(username) && "password123".equals(password)) {
            return true;
        }
        return false; // invalid login
    }
}
