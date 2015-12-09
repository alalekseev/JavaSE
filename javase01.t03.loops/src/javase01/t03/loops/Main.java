package javase01.t03.loops;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        int h;
        double F;

        NumberFormat formatter = new DecimalFormat("#0.0000");
        Scanner scan = new Scanner(System.in);

        System.out.print("a = ");
        a = scan.nextInt();

        System.out.print("b = ");
        b = scan.nextInt();

        System.out.print("h = ");
        h = scan.nextInt();

        System.out.println();
        System.out.println("    X     |   F(X)   ");
        System.out.println("---------+---------");

        int X = a;
        while (X <= b) {

            F = Math.tan(2 * X) - 3;
            System.out.println( X +"\t\t " + "|\t" + formatter.format(F));
            X = X + h;
        }

    }
}
