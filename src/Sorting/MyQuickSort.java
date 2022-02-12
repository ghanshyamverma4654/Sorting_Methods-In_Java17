package Sorting;

import java.util.Arrays;

/*
 * Author Name : Ghanshyam Verma
 * Date : 13-02-2022
 * JDK version : 17 version 17
 * IDE : IntelliJ IDEA Ultimate
 */

public class MyQuickSort {

    public static void main(String[] args) {
        int[] arr = {25, 2, 8, 60, 3};
        int lower = 0;
        int upper = arr.length - 1;
        System.out.println("unsorted --> " + Arrays.toString(arr));
        MyQuickSort obj = new MyQuickSort();
        obj.quickSort(arr, lower, upper);
        System.out.println("sorted --> " + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int lower, int upper) {
        //step 1
        if (lower >= upper) {
            return;
        }
        //step 2
        int pivotIndex = partition(arr, lower, upper);
        //step 3
        quickSort(arr, lower, pivotIndex - 1);
        //step 4
        quickSort(arr, pivotIndex + 1, upper);
    }

    private int partition(int[] arr, int lower, int upper) {
        //step 1
        int pivot = arr[lower];
        //step 2
        int down = lower;
        //step 3
        int up = upper;
        //step 4
        while (down < up) {
            //step 4(a)
            while (down <= upper && arr[down] <= pivot) {
                down = down + 1;

            }
            //step 4(b)
            while (up >= lower && arr[up] > pivot) {
                up = up - 1;

            }
            //step 4(c)
            if (down < up) {
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }

        }
        //step 5
        arr[lower] = arr[up];
        arr[up] = pivot;
        //step 6
        return up;
    }
}
