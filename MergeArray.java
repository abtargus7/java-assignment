/* Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.
 */

public class mergeArray {
    public static void main(String[] args) {
        int[] arr1 = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] arr2 = { 1, 8, 9, 10, 15 };
        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged Array:");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0, k = 0;

        for (i = 0; i < m; i++) {
            if (arr1[i] == 0 && j < n) {
                arr1[i] = arr2[j++];
            }
        }

        arraySort(arr1);
        return arr1;
    }

    public static void arraySort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
