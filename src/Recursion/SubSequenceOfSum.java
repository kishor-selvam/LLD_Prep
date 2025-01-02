package Recursion;

import java.util.Stack;

public class SubSequenceOfSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int k = 2;
        int sum = 0;
        int len = arr.length;
        Stack<Integer> stack = new Stack<>();
        findSubSequence(arr, stack, 0, sum, len, k);

    }


    static boolean findSubSequence(int[] arr, Stack<Integer> list, int i, int sum, int len, int k) {
        if (i == len) {
            if (sum == k) {
                System.out.println(list);
                return true;
            } else return false;
        }

        list.add(arr[i]);
        sum += arr[i];
        if (findSubSequence(arr, list, i + 1, sum, len, k) == true) {
            return true;
        }
        list.pop();
        sum -= arr[i];
        if (findSubSequence(arr, list, i + 1, sum, len, k) == true) {
            return true;
        }
        return false;
    }
}