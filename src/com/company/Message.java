package com.company;

import java.util.Date;

public abstract class Message {

    String author;
    String text;
    Date timestamp = new Date();

    public abstract void postMessage();



}
