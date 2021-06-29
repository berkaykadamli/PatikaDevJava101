package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        Arrays.sort(list);
        int[] fr = new int[list.length];
        int visited = -1;
        for (int i = 0; i < list.length; i++) {
            int count = 1;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
                fr[i] = count;
        }
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println(list[i] + " Sayısı " + fr[i] + " Kere Tekrar edildi.");
        }

    }
}
