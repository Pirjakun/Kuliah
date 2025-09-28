package com.mycompany.tp2;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n, a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n: ");
        n = input.nextInt();

        a = 1;
        b = 1;

        System.out.print(a + " " + b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        input.close();
    }
}
