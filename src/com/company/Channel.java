package com.company;


public class Channel {
    String name;


    public Channel(String name){
        this.name = name;
        System.out.println("You are in channel " + name);
    }

    public void switchChannel(String name){
        this.name = name;
        System.out.println("You have switched to channel " + name);
    }

}
