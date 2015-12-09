package javase01.t02.loops;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i = 1;
        double e;
        double E;

        Scanner scan = new Scanner(System.in);

        System.out.print("E = ");
        E = scan.nextDouble();

        do {
            e = (1/Math.pow(i + 1, 2));
            System.out.println("a[" + i + "] = " + e);
            i++;
        }
        while (e >= E);
    }
}
