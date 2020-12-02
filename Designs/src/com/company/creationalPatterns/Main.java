package com.company.creationalPatterns;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter one of the Options to listen music or exit\n" +
                "1. Indian Classical \n" +
                "2. Rock \n" +
                "3. Symphony \n" +
                "4. Exit");
        int input = scan.nextInt();
        switch (input) {
            case 1 : Music m = MusicFactory.getMusic("Indian Classical");
                           m.hearSound();
            break;
            case 2 : Music m1 = MusicFactory.getMusic("Rock");
                           m1.hearSound();
            break;
            case 3 : Music m2 = MusicFactory.getMusic("Symphony");
                           m2.hearSound();
            break;
            case 4 :  System.out.println("Good bye");
                System.exit(1);
            default : System.out.println("Invalid input");
        }


    }
}
