package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibRec(7));
    }

    public static int fibRec(int a) {
        if (a == 1 || a == 2) {
            return 1;
        }
        return fibRec(a - 1) + fibRec(a - 2);
    }
}
