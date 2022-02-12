package Sorting;
import java.util.Arrays;

/*
 * Author Name : Ghanshyam Verma
 * Date : 13-02-2022
 * JDK version : 17 version 17
 * IDE : IntelliJ IDEA Ultimate
 */
public class MySelectionSort {

    public static void main(String[] args) {
        int[] arr = {12, 8, 16, 2, 5};
        MySelectionSort obj = new MySelectionSort();
        System.out.println("unsorted -->" + Arrays.toString(arr));
        obj.selectionSort(arr);
        System.out.println("sorted -->" + Arrays.toString(arr));
    }

    public void selectionSort(int[] arr) {
        //step 1
        int sortedIndex = arr.length;
        int maximumElement;
        int maximumElementIndex;
        //step 2
        for (int i = 0; i < arr.length; i++) {
            //step 3 find maximum
            maximumElement = arr[0];
            maximumElementIndex = 0;
            for (int j = 0; j < sortedIndex; j++) {
                if (maximumElement < arr[j]) {
                    maximumElement = arr[j];
                    maximumElementIndex = j;
                }
            }
            System.out.println("maximum = " + maximumElement);
            //step 4 swap

            System.out.println("swapping --> " + arr[maximumElementIndex] + " with --> " + arr[sortedIndex - 1]);
            int temp = arr[maximumElementIndex];
            sortedIndex--;
            arr[maximumElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
        }
    }
}
