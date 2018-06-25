package com.company;


import java.util.Date;

public class TextMessage extends Message implements Likeable {

    public TextMessage(String author, String text) {
        this.author = author;
        this.text = text;
    }

    @Override
    public void postMessage() {
        System.out.println(text);
        System.out.println("This message was posted by " + author);
        System.out.println("The date is " + timestamp);
    }

    @Override
    public void like(String user) {
        System.out.println("User " + user + " liked this message");
        System.out.println("The date is " + new Date());
    }

}
