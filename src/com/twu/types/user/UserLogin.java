package com.twu.types.user;


public class UserLogin {
    private UserName userNameLogin;
    private UserPassword password;

    public UserLogin(UserName userName, UserPassword userPassword){
        this.userNameLogin = userName;
        this.password = userPassword;
    }


    public boolean passwordIsCorrect(String password){
        return password.equals(this.password.getPassword());
    }


}



