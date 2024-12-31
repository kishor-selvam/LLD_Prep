package Recursion;

public class PrintNameNTimes {
    public static void main(String[] args) {
        int n = 5;
        String name = "Kishor";
        func(n, name);
    }

    static void func(int n, String name) {
        if (n <= 0) return;
        System.out.println(name);
        func(n - 1, name);
    }
}
