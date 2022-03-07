package com.company;

import java.util.Scanner;

public class Main {

    public boolean getYNAnswer(String question) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println(question);

        char response = keyboard.next().charAt(0);
        while (response != 'y' && response != 'n') {
            System.out.println("Invalid response. Try again.");
            response = keyboard.next().charAt(0);
        }
        if (response == 'n') {
            System.out.println("test");
            return Boolean.FALSE;
        } else if (response == 'y') {
            System.out.println("Great! Let's get started.");
            return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    public boolean doWhile(String question) {

        Scanner keyboard = new Scanner(System.in);
        char response = keyboard.next().charAt(0);
        System.out.println(question);

        do {
            System.out.println("Invalid response. Try again.");
            response = keyboard.next().charAt(0);
        }
        while (response != 'y' && response != 'n');

        if (response == 'n') {
            System.out.println("test");
            return Boolean.FALSE;
        } else if (response == 'y') {
            System.out.println("Great! Let's get started.");
            return Boolean.TRUE;
        }

    return Boolean.TRUE;
    }




    public static void main(String[] args) {
	  Main obj = new Main();
    String question = "Would you like to order some coffee? (y/n)";
        System.out.println(obj.getYNAnswer(question));

       System.out.println(obj.doWhile(question));
    }
}
