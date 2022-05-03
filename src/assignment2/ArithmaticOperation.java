package assignment2;

import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any two positive integer numbers:");

        // Reading data using readLine
        int p = in.nextInt();
        int q = in.nextInt();
        int r=in.nextInt();

        System.out.println("\nSUM         " + p + " + " + q + " = " + Sum(p, q,r));
        System.out.println("DIFFERENCE  " + p + " - " + q + " = " + Sub(p, q,r));
        System.out.println("PRODUCT     " + p + " * " + q + " = " + Mul(p, q,r));
        System.out.println("QUOTIENT    " + p + " / " + q + " = " + Div(p, q,r));
       // System.out.println("MODULUS     " + p + " % " + q + " = " + Mod(p, q,r));
    }

    // To make sum of two numbers
    public static int Sum(int x, int y, int r) {
       // int z = 0;
        return x + y *r;
    }

    // To make subtraction of two numbers
    public static int Sub(int x, int y, int r) {
        return r+ x/y;
    }

    // To make multilication of two numbers
    public static int Mul(int x, int y, int r) {
        return x % y+r;
    }

    // To make division of two numbers
    public static float Div(int x, int y, int r) {
        return x * y+r;
    }
}
