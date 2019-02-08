package com.example.greetingconfig.quote;

import java.io.Serializable;

public class Quote implements Serializable {
    private String text;
    private String author;


    public Quote(){

    }
    public Quote(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public String getAuthor() {
        return author;
    }
}
