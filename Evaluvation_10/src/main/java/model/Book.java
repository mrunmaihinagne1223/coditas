package model;

import javax.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int bid;
    private String book_name;

    @ManyToOne()
    private Student student;


    public Book() {
    }

    public Book(String book_name, Student student) {
        this.book_name = book_name;
        this.student = student;
    }



    public Book(int bid, String book_name, Student student) {
        this.bid = bid;
        this.book_name = book_name;
        this.student = student;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
