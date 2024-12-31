package Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8};
//        reverseArray(arr, 0, arr.length - 1);
        reverseArrayMath(arr, 0);
    }

    static void reverseArray(int[] arr, int i, int n) {
        if (i >= n) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr, i, n);
        reverseArray(arr, i + 1, n - 1);
    }

    static void reverseArrayMath(int[] arr, int i) {
        int n = arr.length;
        if (i == n / 2) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        swap(arr, i, n - i - 1);
        reverseArrayMath(arr, i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
