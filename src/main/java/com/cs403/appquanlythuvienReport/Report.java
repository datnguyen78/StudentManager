package com.cs403.appquanlythuvienReport;

import com.cs403.appquanlythuvien.Loan.Loan;

public class Report {
    public String reportId;    
    public String createdDate;  
    public String adminName;    

    public Report(String reportId, String createdDate, String adminName) {
        this.reportId = reportId;
        this.createdDate = createdDate;
        this.adminName = adminName;
    }

    public void analyzeLoanData(Loan id) {
        System.out.println("\n========== [REPORT MODULE] ==========");
        System.out.println("Bao cao ngay: " + createdDate + " | Admin: " + adminName);
        System.out.println("Dang phan tich phieu muon: " + id.borrowID);
        System.out.println(">>> Thong ke:");
        System.out.println("   - Sach duoc muon: " + id.book.title);
        System.out.println("   - Nguoi muon: " + id.borrower.fullname);
        System.out.println("   - Thoi han: " + id.daysBorrowed + " ngay");
        
        if (id.daysBorrowed > 21) {
            System.out.println("   - Canh bao: Thoi gian muon qua dai (Rui ro cao)");
        } else {
            System.out.println("   - Trang thai: Binh thuong");
        }
    }
}