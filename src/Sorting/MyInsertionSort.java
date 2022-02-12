package Sorting;
import java.util.Arrays;

/*
 * Author Name : Ghanshyam Verma
 * Date : 13-02-2022
 * JDK version : 17 version 17
 * IDE : IntelliJ IDEA Ultimate
 */
public class MyInsertionSort {

    public static void main(String[] args) {
        int[] arr = {12, 8, 16, 2, 5};
        System.out.println("unsorted --> " + Arrays.toString(arr));
        MyInsertionSort obj = new MyInsertionSort();
        obj.insertionSort(arr);
        System.out.println("sorted --> " + Arrays.toString(arr));
    }

    public void insertionSort(int[] arr) {
        //step 1
        int sortedIndex = 0;
        //step 2
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            //step 3
            int nextElement = arr[unsortedIndex];
            System.out.println("next element --> " + nextElement);
            //step 4
            for (int j = unsortedIndex; j > 0; j--) {
                //step 5
                if (arr[j] < arr[j - 1]) {
                    System.out.println("swapping --> " + arr[j] + " with --> " + arr[j - 1]);
                    // step 6
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    System.out.println("breaking because --> " + arr[j] + " is greater than or equal to --> " + arr[j - 1]);
                    break;
                }
            }
        }
    }
}
