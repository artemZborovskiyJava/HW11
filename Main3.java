package com.javahw;

import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
	    /*
	        3*. Реализовать MergeSort
	    */

        int[] array = {34, -912, 12, 0, 11, -98, -17, 38};
        System.out.println("Перед сортировкой: " + Arrays.toString(array));
        sortArray(array, 0, array.length - 1);
        System.out.println("После сортировки: " + Arrays.toString(array));
    }

    private static void sortArray(int[] a, int low, int high) {
        if (high <= low) {
            return;
        }

        int middle = low + (high - low) / 2;
        sortArray(a, low, middle);
        sortArray(a, middle + 1, high);
        int[] buffer = Arrays.copyOf(a, a.length);
        if (high + 1 - low >= 0) System.arraycopy(a, low, buffer, low, high + 1 - low);
        int i = low, j = middle + 1;

        for (int k = low; k <= high; k++) {
            if (i > middle) {
                a[k] = buffer[j];
                j++;
            } else if (j > high) {
                a[k] = buffer[i];
                i++;
            } else if (buffer[j] < buffer[i]) {
                a[k] = buffer[j];
                j++;
            } else {
                a[k] = buffer[i];
                i++;
            }
        }
    }
}
