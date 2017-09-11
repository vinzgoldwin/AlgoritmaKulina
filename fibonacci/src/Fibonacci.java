
package Fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[]args) {
        Scanner show = new Scanner(System.in);
        System.out.print("Jumlah deret Fibonacci yang diingginkan? ");
        int n = show.nextInt();
        long fib[] = new long[n];

        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] +  " ");
        }
    }

}