package com.springboot.first.app;

public class Student {
    private String firstnmae;
    private String lastname;

    public Student(String firstnmae, String lastname) {
        this.firstnmae = firstnmae;
        this.lastname = lastname;
    }

    public String getFirstnmae() {
        return firstnmae;
    }

    public void setFirstnmae(String firstnmae) {
        this.firstnmae = firstnmae;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
