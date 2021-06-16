package com.company;

public class Main {

    public static boolean isPalindrome(int n) {
        int temp = n, reverse = 0;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        return n == reverse;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(131));
    }
}
