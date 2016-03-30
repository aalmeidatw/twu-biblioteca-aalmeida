package com.twu.types.user;


import com.sun.deploy.util.StringUtils;
import com.twu.types.Name;

public class User {
    private Name name;
    private NameLoginUser nameLogin;
    private PassWordUser password;
    private EmailUser email;
    private PhoneNumberUser phoneNumber;

    public User(Name name, NameLoginUser nameLogin, PassWordUser passWordUser, EmailUser email, PhoneNumberUser phoneNumber){
        this.name = name;
        this.nameLogin = nameLogin;
        this.password = passWordUser;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserName (){
        return nameLogin.getName();
    }

    public boolean isPasswordCorrect(String password){
        return password.equals(this.password.getPassword());
    }

    @Override
    public String toString() {
        return "Name : " + name.getName() +
                "Email : " + email.getEmailUser() +
                "Phone : " + phoneNumber.getPhone();
    }
}



