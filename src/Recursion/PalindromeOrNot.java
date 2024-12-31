package Recursion;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String s = "madam";
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("1.Palindrome");
            System.out.println("2.Exit");
            int n = in.nextInt();
            if (n == 1) {
                System.out.println("Enter String : ");
                String text = in.next();
                System.out.println(checkPalindrome(text, 0));
            } else if (n == 2) {
                flag = false;
            }
        }
    }

    static boolean checkPalindrome(String s, int i) {
        int n = s.length();
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return checkPalindrome(s, i + 1);
    }
}
