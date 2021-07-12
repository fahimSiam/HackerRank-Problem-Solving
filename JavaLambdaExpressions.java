import java.io.*;
import java.util.*;

public class JavaLambdaExpressions {

    public static void main(String[] args) {
        Scanner meaw = new Scanner(System.in);
        int T = meaw.nextInt();
        String result = "";
        while (T-- > 0) {
            int process = meaw.nextInt();
            int number = meaw.nextInt();
            if (process == 1) {
                result = isOdd(number);
            } else if (process == 2) {
                result = isPrime(number);
            } else if (process == 3) {
                result = isPalindrome(number);
            } else {
                result = "WRONG INPUT";
            }
            System.out.println(result);
        }
    }

    private static String isPalindrome(int number) {
        int num, temp, reverse = 0;

        num = number;
        temp = num;
        // code to reverse the number
        while (temp != 0) {
            int d = temp % 10; // extracts digit at the end
            reverse = reverse * 10 + d;
            temp /= 10; // removes the digit at the end
        }
        // 'reverse' has the reverse version of the actual input, so we check
        if (reverse == num) {
            return "PALINDROME";
        } else {
            return "NOT PALINDROME";
        }

    }

    private static String isPrime(int number) {
        String result = "PRIME";
        if (number <= 1) {
            result = "COMPOSITE";

        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                result = "COMPOSITE";
                break;
            }
        }
        return result;
    }

    private static String isOdd(int number) {
        if (number % 2 == 0)
            return "EVEN";
        else
            return "ODD";
    }
}