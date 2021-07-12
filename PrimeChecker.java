import java.io.*;
import java.util.*;

class Prime {
    void checkPrime(int[] a) {
        for (int j = 0; j < a.length; j++) {
            boolean isPrime = true;
            int n = a[j];
            if (n <= 1) {
                isPrime = false;
                a[j] = -1;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    a[j] = -1;
                    break;
                }
            }
            if (j!=3) {
                for (int k = 0; k <= j; k++) {
                    if (a[k] != -1) {
                        System.out.print(a[k] + " ");
                    }
                }
                System.out.println();
            }
        }

    }
}

public class PrimeChecker {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner meaw = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = meaw.nextInt();
        }
        Prime p = new Prime();
        p.checkPrime(a);
    }
}