package Recursion;

//Count of Subsequences with Sum Equal to K

//Problem Name
//"Count Subsequences with a Given Sum"



public class CountOfAllSubSequences {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        int k = 2;
        int sum = 0;
        int index = 0;
        int len = arr.length;
        System.out.println(countAllSubSequences(arr, index, sum, k, len));

    }


    static int countAllSubSequences(int[] arr, int index, int sum, int k, int len) {
//        base condition

        if (sum > k) {
            return 0;
        }

        if (index == len) {
            if (k == sum) {
                return 1;
            }
            return 0;
        }

        sum += arr[index];
        int left = countAllSubSequences(arr, index + 1, sum, k, len);

        sum -= arr[index];
        int right = countAllSubSequences(arr, index + 1, sum, k, len);

        return left + right;

    }
}
