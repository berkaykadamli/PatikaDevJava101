package com.company;


public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        double harmonik = 1;

        for (int i = 0; i < arr.length; i++) {
            harmonik += (1 / arr[i]);
        }

        System.out.println(arr.length / harmonik);
    }
}
