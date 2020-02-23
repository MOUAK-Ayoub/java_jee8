package com.chap03.model;

public class Author implements java.io.Serializable {
    private String first;
    private String last;
    private String bio;



    public Author(String first, String last, String bio) {
        this.first = first;
        this.last = last;
        this.bio = bio;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}