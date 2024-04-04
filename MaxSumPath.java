/* Find maximum sum path involving elements of given arrays
Given two sorted arrays of integers, find a maximum sum path involving elements of both arrays whose sum is maximum. 
We can start from either array, but we can switch between arrays only through its common elements.
 */
public class MaxSumPath {
    public static int maxSumPath(int[] arr1, int[] arr2) {
        int sum1 = 0, sum2 = 0, maxSum = 0;
        int idx1 = 0, idx2 = 0;

        while (idx1 < arr1.length && idx2 < arr2.length) {
            if (arr1[idx1] == arr2[idx2]) {
                maxSum += Math.max(sum1, sum2) + arr1[idx1];
                sum1 = 0;
                sum2 = 0;
                idx1++;
                idx2++;
            } else if (arr1[idx1] < arr2[idx2]) {
                sum1 += arr1[idx1];
                idx1++;
            } else {
                sum2 += arr2[idx2];
                idx2++;
            }
        }

        while (idx1 < arr1.length) { 
            sum1 += arr1[idx1];
            idx1++;
        }

        while (idx2 < arr2.length) { 
            sum2 += arr2[idx2];
            idx2++;
        }

        maxSum += Math.max(sum1, sum2);
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 7, 10, 12};
        int[] arr2 = {1, 5, 7, 8};
        System.out.println("Maximum sum path: " + maxSumPath(arr1, arr2)); 
    }
}
