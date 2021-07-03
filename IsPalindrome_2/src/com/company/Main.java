package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String s = scan.next();
        System.out.println(isPalindrome(s) ? "Girdiğiniz Kelime Palindrome " : "Girdiğiniz Kelime Palindrome değil");
    }

    public static boolean isPalindrome(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        // 3
        return reverse.equals(s) ? true : false;
    }
}
