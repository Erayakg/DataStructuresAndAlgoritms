/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*/

package datastructuresandalgoritms;

import java.lang.reflect.Array;

/**
 *
 * @author erayb
 */

public class MergeSortAlgoritm {

    public void MergeSort(int[] array, int bas, int son, int orta) {
        int[] kopyadizi = new int[array.length];
        int i, j, k;
        i = bas;
        j = orta;
        for (int l = 0; l < array.length; l++) {
            kopyadizi[l] = array[l];
        }
        printArray(array);
    }
    public void printArray(int[] array)
    {
        int s=array.length;
        System.out.println("yeni dizi\n");
        for (int i = 0; i < s; i++) {
            System.out.print(array[i]+"-");
        }
    }
    public void Bol(int bas, int son, int[] dizi) {

        if (son > bas) {
            int orta = (bas + son) / 2;
            Bol(bas, orta, dizi);
            Bol(orta + 1, son, dizi);
            MergeSort(dizi, bas, son, orta);
            
        }
    }
}
