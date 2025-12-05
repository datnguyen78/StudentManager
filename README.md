# AppQuanLyThuVien (Library Management System)

A Java-based Library Management System developed for the **CS403** course.  
This application is designed to handle the core operations of a library, including user management, book tracking, and loan processing.

---

## 📋 Project Overview

The **AppQuanLyThuVien** helps administrators and librarians manage the daily workflow of a library efficiently.  
It organizes data into key modules such as **users, books, loans, notifications, and reporting**.

---

## ✨ Features

- **User Management**
  - Manage user profiles including ID, full name, and roles (Admin, Student, Librarian).
  - View user details.

- **Book & Category Management**
  - Organize books into specific categories.
  - Manage book inventory.

- **Loan Management**
  - Track book loans and returns.

- **Notifications**
  - Handle alerts (e.g., due dates or system messages).

- **Reporting**
  - Generate reports regarding library activities (located in `appquanlythuvienReport`).

---

## 🛠️ Tech Stack

- **Language**: Java  
- **Build Tool**: Maven  
- **IDE Support**: IntelliJ IDEA / NetBeans (inferred from `nbactions.xml` and `.idea` folder)

---

## 📂 Project Structure

```text
StudentManager/
├── src/main/java/com/cs403/appquanlythuvien
│   ├── AppQuanLyThuVien.java   # Main Entry Point
│   ├── Category                # Book Category Logic      
│   ├── Loan                    # Borrowing/Returning Logic
│   ├── Notification            # Notification System
│   ├── User                    # User Management (ID, Name, Role)
│   └── appquanlythuvienReport  # Reporting Module
├── pom.xml                     # Maven Configuration
└── nbactions.xml               # NetBeans Actions
