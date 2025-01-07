package Recursion;

import java.util.List;
import java.util.ArrayList;

//Leetcode 39 - Combination Sum
public class CombinationSum {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        List<Integer> dubArr = new ArrayList<>();
        findCombination(0, arr, target, ans, dubArr);
        System.out.println(ans);

    }


    static void findCombination(int index, int[] arr, int target, List<List<Integer>> ans, List<Integer> l) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(l));
            }
            return;
        }

        if (arr[index] <= target) {
            l.add(arr[index]);
            findCombination(index, arr, target - arr[index], ans, l);
            l.remove(l.size() - 1);
        }
        findCombination(index + 1, arr, target, ans, l);


    }

}
