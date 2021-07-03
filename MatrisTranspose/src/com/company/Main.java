package com.company;

public class Main {

    public static void main(String[] args) {
        int[][] n = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matris : ");
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(n[i][j] + "   ");
            }
            System.out.println();
        }

        int[][] newArray = new int[n[0].length][n.length];
        System.out.println("Transpoze : ");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                newArray[i][j] = n[j][i];
                System.out.print(newArray[i][j] + "   ");
            }
            System.out.println();
        }

        /* 1 2 3
           4 5 6

           1 4
           2 5
           3 6

         */
    }
}
