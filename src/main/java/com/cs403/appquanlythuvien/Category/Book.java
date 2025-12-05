package com.cs403.appquanlythuvien.Category;

public class Book {
    public String title;
    public String category;

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
    }

    public void showBookInfor(){
        System.out.println("[Book] "+title+". The loai: "+category);
    }
    
}
