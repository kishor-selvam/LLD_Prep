import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    //    https://leetcode.com/problems/two-sum/description/
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 19;

        System.out.println(Arrays.toString(findTwoSum(arr, target)));
    }

    public static int[] findTwoSum(int[] arr, int target) {
        Map<Integer, Integer> emptyMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int check = target - arr[i];
            if (emptyMap.containsKey(check)) {
                int valueIndex = emptyMap.get(check);
                return new int[]{valueIndex, i};
            } else {
                emptyMap.put(arr[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
