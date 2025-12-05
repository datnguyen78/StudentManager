package com.cs403.appquanlythuvien;

import com.cs403.appquanlythuvien.Category.Book;
import com.cs403.appquanlythuvien.Loan.Loan;
import com.cs403.appquanlythuvien.User.User;
import com.cs403.appquanlythuvienReport.Report;

public class AppQuanLyThuVien {

    public static void main(String[] args) {
       System.out.println("=== HE THONG QUAN LY THU VIEN ===\n");

        // Đối tượng 1
        User user1 = new User("U005", "Tran Thi B", "Giang Vien");
        Book book1 = new Book("Clean Code", "Ky Thuat Phan Mem");

        Loan loanId1 = new Loan("ID-001", user1, book1, 45); 
        loanId1.processLoan();

        // Đối tượng 2
        User user2 = new User("U006", "Nguyen Van A", "Sinh Vien");
        Book book2 = new Book("Design Patterns", "Lap Trinh Huong Doi Tuong");

        Loan loanId2 = new Loan("ID-002", user2, book2, 30);
        loanId2.processLoan();

        // Tạo report
        Report report = new Report("RP-20251127", "27/11/2025", "Admin Manager");

        // Report lấy dữ liệu từ LoanID để phân tích
        report.analyzeLoanData(loanId1);
        report.analyzeLoanData(loanId2);
    }
}