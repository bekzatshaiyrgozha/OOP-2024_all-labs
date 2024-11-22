package lab3.problem_5;

import java.util.Arrays;

public class Sort {

    //Merge sort
    public static <E extends Comparable<E>> void mergeSort(E[] arr) {
        if(arr == null || arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        E[] left = Arrays.copyOfRange(arr, 0, mid);
        E[] right = Arrays.copyOfRange(arr, mid, arr.length);
        mergeSort(left);
        mergeSort(right);
        merge(arr,left,right);

    }


    public static <E extends Comparable<E>> void merge(E[] arr,E[] left,E[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (arr[i].compareTo(right[j]) < 0) {
                arr[k++] = left[i++];
            }else arr[k++] = right[j++];
        }
        while (i < left.length) {
            arr[k++] = left[i++];

        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }



    }

    //Buble sort
    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <E extends Comparable<E>> void bubbleSort(E[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

}
