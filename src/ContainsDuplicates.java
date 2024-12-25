import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    //    Leetcode 217
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
//        System.out.println(containsDublicate(arr));
        System.out.println(containsDublicatesOA(arr));
    }


    //    Optimcal Approach - Using Hashset TC:O(n) SC:O(n)
    private static boolean containsDublicatesOA(int[] arr) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                return true;
            }
            s.add(arr[i]);
        }
        return false;
    }

    //    Bruteforce Approach  TC:O(n2) SC:O(1)
    private static boolean containsDublicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
