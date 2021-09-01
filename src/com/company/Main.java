package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number of lines");
        int  m = new Scanner(System.in).nextInt();
        System.out.println("Enter the number of star");
        int  s = new Scanner(System.in).nextInt();
        for (int j = 0; j <= m; j++) {
            for (int i = 0; i <= s; i++) {
                System.out.print("+");

            }
            System.out.println("");
        }
    }
}

