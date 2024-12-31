package Recursion;

public class Print1toN {
    public static void main(String[] args) {
        int n = 5;
        func(n);
    }

    static void func(int n) {
        if (n < 1) return;
        System.out.println(n);
        func(n - 1);
    }
}
