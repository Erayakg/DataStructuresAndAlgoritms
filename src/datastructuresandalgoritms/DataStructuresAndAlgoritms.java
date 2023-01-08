/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datastructuresandalgoritms;

/**
 *
 * @author erayb
 */
public class DataStructuresAndAlgoritms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        MergeSortAlgoritm mergeSortAlgoritm=new MergeSortAlgoritm();
        
        int[] array={1,9,4,31,58,32,98,43};

        mergeSortAlgoritm.mergeSort(array,array.length);
        System.out.println("Sorted array with MergeSort:");
        mergeSortAlgoritm.printArray(array);

    }
    
}
