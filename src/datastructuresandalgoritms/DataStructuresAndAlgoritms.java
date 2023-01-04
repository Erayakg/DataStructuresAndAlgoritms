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
        
        int[] array={1,3,6,9,7,24,12};
        
        mergeSortAlgoritm.Bol(0, array.length, array);

    }
    
}
