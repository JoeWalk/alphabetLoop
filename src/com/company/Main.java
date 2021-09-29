package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "O", "M", "N", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        int length = alphabet.length;
        System.out.println("Enter a letter in uppercase");
        String userLetter = input.next();
        System.out.println("Enter how far you want to go back in the alphabet");
        int userDistance = input.nextInt();
        int start = 0;
        for (int i = 0; i < length; i++) {
            if (alphabet[i].equals(userLetter)) {
                start = i;
            }
        }
        for (int a = 0; a < 7; a++) {
            if (start < 0) {
                start = 25;
            } else {
                System.out.println(alphabet[start]);
                start = start - 1;
            }
        }
    }
}
