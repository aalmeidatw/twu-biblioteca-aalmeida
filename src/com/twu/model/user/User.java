package com.twu.model.user;


import java.util.ArrayList;

public class User {
    private UserName userName;
    private UserNameLogin userNameLogin;
    private UserPassword password;
    private int libraryNumber;
    private static ArrayList<User> users = new ArrayList<>();


    public User(UserName userName, UserNameLogin userNameLogin, UserPassword password, int libraryNumber){
        this.userName = userName;
        this.userNameLogin = userNameLogin;
        this.password = password;
        this.libraryNumber = libraryNumber;
        this.users.add(this);
    }

    public String getUserName(){
        return userName.getName();
    }

    public String getUserNameLogin(){
        return userNameLogin.getName();
    }

    public String getPasswordNumber(){
        return password.getPassword();
    }

    public int getLibraryNumber(){
        return this.libraryNumber;
    }

    public boolean authenticateUser(String userName, String userPassword){
        for(User user : users){
            if(user.userNameLogin.getName().equals(userName) && (user.password.getPassword().equals(userPassword))){
                return true;
            }

        }
        return false;

    }







}
