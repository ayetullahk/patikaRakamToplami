package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 1, b = 0, k;
        Scanner input = new Scanner(System.in);
        System.out.print("sayiyi giriniz :");
        k = input.nextInt();

        while (k != 0 && a != 0) {
            a = k % 10;
            k = k / 10;
            b = b + a;
        }
        System.out.println("Toplam :" + b);
    }
}