/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresandalgoritms;

/**
 *
 * @author erayb
 */
public class MergeSortAlgoritm {

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
    }

    public static void mergeSort(int[] array, int size) {

        if (size > 1) {
            int mid = size / 2;
            int LeftSize = mid;
            int RigthSize = size - LeftSize;

            int[] LeftArray = new int[LeftSize];
            int[] RigthArray = new int[RigthSize];

            for (int i = 0; i < mid; i++) {
                LeftArray[i] = array[i];
            }
            for (int i = 0; i < RigthSize; i++) {
                RigthArray[i] = array[mid + i];
            }

            mergeSort(LeftArray, LeftSize);
            mergeSort(RigthArray, RigthSize);

            merge(array, LeftArray, RigthArray, RigthSize, LeftSize);
        }
    }

    public static void merge(int[] array, int[] LeftArray, int[] RightArray, int RigthSize, int leftSize) {
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < RigthSize) {

            if (LeftArray[i] <= RightArray[j]) {
                array[k++] = LeftArray[i++];
            } else {
                array[k++] = RightArray[j++];
            }
        }
        while (i < leftSize) {
            array[k++] = LeftArray[i++];
        }
        while (j < RigthSize) {
            array[k++] = RightArray[j++];
        }

    }

}
