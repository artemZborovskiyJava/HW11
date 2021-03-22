package com.javahw;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    /*
	        2*. Реализовать QuickSort
	    */

        int[] arr = {19, -89, 124, 8, 21, 0, 67, -109};
        System.out.println("До сортировки: " + Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);
        System.out.println("После сортировки: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] array, int low, int high) {
        int middle = low + (high - low) / 2;
        int mainElement = array[middle];
        int i = low, j = high;

        while (i <= j) {
            while (array[i] < mainElement) {
                i++;
            }

            while (array[j] > mainElement) {
                j--;
            }

            if (i <= j) {
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }

        if (high > i) {
            quickSort(array, i, high);
        }
    }
}
