package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username = "";
        Scanner in = new Scanner(System.in);
        System.out.println("What is your username:");
        username = in.nextLine();

        System.out.println("What channel would you like to join?");
        Channel channel = new Channel(in.nextLine());

        int answer;

        do {
            System.out.println("Choose your action: ");
            System.out.println("Switch channel: 1");
            System.out.println("Post text message: 2");
            System.out.println("Exit: 0");

            answer = in.nextInt();
            in.nextLine();

            switch (answer) {
                case 0:
                    System.out.println("Good bye");
                    break;
                case 1:
                    System.out.println("What channel do you want to switch to: ");
                    channel.switchChannel(in.nextLine());
                    break;

                case 2:
                    System.out.println("What is you message: ");
                    TextMessage test = new TextMessage(username, in.nextLine());
                    break;
            }
        } while (answer != 0);


    }
}
