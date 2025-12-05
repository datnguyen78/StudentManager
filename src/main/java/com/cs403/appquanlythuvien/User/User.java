package com.cs403.appquanlythuvien.User;

public class User {
    public String userID; //User Id must not be null
    public String fullname;
    public String role;

    public User(String userID, String fullname, String role) {
        this.userID = userID;
        this.fullname = fullname;
        this.role = role;
    }
    
    public void showUserInfor(){
        System.out.println("[User] ID: "+ userID + "| Ten: "+fullname +"("+ role +")");
    }
    
}
