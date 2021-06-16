package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String username = "ekmek", password = "reis";
        String inputUsername, inputPass;
        System.out.print("Kullanıcı Adı Giriniz : ");
        inputUsername = scan.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        inputPass = scan.nextLine();


        if (username.equals(inputUsername) && password.equals(inputPass)) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Kullanıcı adı veya şifre yanlış");
            System.out.println("Şifrenizi Sıfırlamak ister misiniz (y/n)");

            if (scan.nextLine().equals("y")) {
                System.out.print("Yeni şifrenizi Giriniz : ");
                String resetPassword = scan.nextLine();
                if (password.equals(resetPassword)) {
                    System.out.println("Yeni ve Eski Şifre Aynı Olamaz !");
                } else {
                    password = resetPassword;
                    System.out.println("Yeni Şifre Oluşturuldu");

                }
            }

        }
    }


}
