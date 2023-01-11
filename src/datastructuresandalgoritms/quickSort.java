/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresandalgoritms;

/**
 *
 * @author erayb
 */
public class quickSort {

    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int partition(int[] array, int firstİndex, int Lastİndex) {
        int i, j, pivot;
        pivot = array[Lastİndex];
        i = firstİndex - 1;

        for (j = firstİndex; j < Lastİndex; j++) {
            if (array[j]<=pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, Lastİndex);
        return i + 1;

    }
    public void quickSort(int[] array ,int Firstİndex,int Lastİndex){
        if (Lastİndex>Firstİndex) {            
            int pivot=partition(array, Firstİndex, Lastİndex);
            quickSort(array, Firstİndex, pivot-1);
            quickSort(array, pivot+1, Lastİndex);
            
        }
    }
      public  void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
    }
}
