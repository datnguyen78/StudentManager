
package com.cs403.appquanlythuvien.Loan;
import com.cs403.appquanlythuvien.Category.Book;
import com.cs403.appquanlythuvien.Notification.NotificationService;
import com.cs403.appquanlythuvien.User.User;

public class Loan {
    public String borrowID;  //Must not be null
    public User borrower;  
    public Book book;     
    public int daysBorrowed;

    public Loan(String borrowID, User borrower, Book book, int daysBorrowed) {
        this.borrowID = borrowID;
        this.borrower = borrower;
        this.book = book;
        this.daysBorrowed = daysBorrowed;
    }

    public void processLoan() {
        System.out.println("Đang xu ly muon sach: " + borrowID);
        
        // 1. Kiểm tra người dùng
        borrower.showUserInfor();
        
        // 2. Kiểm tra sách
        book.showBookInfor();
        
        // 3. Gửi thông báo
        String msgContent = "Ban da muon sach '" + book.title + "'. Han tra: " + daysBorrowed + " ngay";
        NotificationService noti = new NotificationService(borrower.userID, msgContent, "27/11/2025");
        noti.send();
    
}
}
