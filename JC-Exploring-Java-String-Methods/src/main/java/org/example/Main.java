package org.example;

public class Main {
    public static void main(String[] args) {

        //Exercise 6: equals() vs. equalsIgnoreCase() - Comparing Strings
        String str1 = "Java";
        String str2 = "java";
        String str3 = "Java";

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println("\"Java\".equals(\"java\"): " + isEqual1);
        System.out.println("\"Java\".equals(\"Java\"): " + isEqual2);
        System.out.println("\"Java\".equalsIgnoreCase(\"java\"): " + isEqualIgnoreCase);

        //Prediction: "Java".equals("java"): false \n "Java".equals("Java"): true \n "Java".equalsIgnoresCase("java"): true
        //Actual:
    }
}