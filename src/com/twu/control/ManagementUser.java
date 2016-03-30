package com.twu.control;


import com.twu.provider.LibraryUsers;
import com.twu.types.user.User;
import java.util.ArrayList;
import java.util.Optional;

public class ManagementUser {
    private ArrayList<User> libraryUsers = new ArrayList<>();

    public ManagementUser(){
        this.libraryUsers = new LibraryUsers().createLibraryUsers();
    }

    public boolean loginUser(String userName, String password){

        return this.libraryUsers.stream()
                   .anyMatch(user -> isUserRegistred(user, userName, password) );
    }

    protected boolean isUserRegistred(User user, String userName, String password){
        return user.getUserName().equals(userName) && (user.isPasswordCorrect(password));
    }

    public User getUser(String userName){

        Optional<User> userResult = libraryUsers
                                        .stream()
                                        .filter(user -> user.getUserName().equals(userName) )
                                        .findFirst();
        return userResult.orElse(null);
    }

}
