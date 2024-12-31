package Recursion;

import java.util.ArrayList;
import java.util.Stack;

public class SubSequences {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
//        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int n = arr.length;
        subSequence(arr, 0, stack, n);
    }

    static void subSequence(int[] arr, int i, Stack<Integer> list, int n) {

        if (i == n) {
            System.out.println(list);
            return;
        }
//        list.add(arr[i]);
        subSequence(arr, i + 1, list, n);
        list.push(arr[i]);
        subSequence(arr, i + 1, list, n);
//        list.remove(arr[i-1]);
        list.pop();
    }
}
