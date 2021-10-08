package com.example.mongo.objects;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Book {

    String uniqueId;
    String tittle;
    String author;
    LocalDate borrowingData;
    LocalDate returningData;
    Borrower borrower;

    public Book(String tittle, String author, LocalDate borrowingData, LocalDate returningData, Borrower borrower){
        this.uniqueId = setUniqueId();
        this.tittle = tittle;
        this.author = author;
        this.borrowingData = borrowingData;
        this.returningData = returningData;
        this.borrower = borrower;
    }


    public String getUniqueId() {
        return uniqueId;
    }

    public String setUniqueId() {
       return this.uniqueId = UUID.randomUUID().toString();
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getBorrowingData() {
        return borrowingData;
    }

    public void setBorrowingData(LocalDate borrowingData) {
        this.borrowingData = borrowingData;
    }

    public LocalDate getReturningData() {
        return returningData;
    }

    public void setReturningData(LocalDate returningData) {
        this.returningData = returningData;
    }

    public Borrower getBorrower() {
        return borrower;
    }

    public void setBorrower(Borrower borrower) {
        this.borrower = borrower;
    }

    @Override
    public String toString() {
        return "Book{" +
                "uniqueId='" + uniqueId + '\'' +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", borrowingData=" + borrowingData +
                ", returningData=" + returningData +
                ", borrower=" + borrower +
                '}';
    }

    public static void sprintujCos(){
        System.out.println(new Book("HP 1",
                "JKR",
                LocalDate.of(2021, 7, 6),
                LocalDate.of(2021, 7, 9),
                new Borrower("Marek", "Adamiec")
        ));
    }
}
