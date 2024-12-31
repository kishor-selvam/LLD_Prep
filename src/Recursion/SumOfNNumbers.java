package Recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(func(n));
    }

    static int func(int n) {
        if (n < 1) return 0;
        return n + func(n - 1);
    }
}
