package org.example;

public class Main {
    public static void main(String[] args) {

        //Exercise 8: trim() - Removing Whitespace
        String padded = "   Lots of spaces   ";
        String trimmed = padded.trim();

        System.out.println("Padded string length: " + padded.length());
        System.out.println("Trimmed string: '" + trimmed + "'");
        System.out.println("Trimmed string length: " + trimmed.length());


        //Prediction: Padded string length: 20 \n Trimmed string: 'Lots of spaces' \n Trimmed string length: 14
        //Actual:
    }
}