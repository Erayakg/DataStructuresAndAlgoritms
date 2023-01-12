/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datastructuresandalgoritms;

/**
 *
 * @author erayb
 */
public class HashFunctions {
    
    public int Hash(int arrLenght,int Key){
        int value=Key%arrLenght;
        return value;
    }
    public void HashTable(int[] arr,int Value){
        int key=Hash(arr.length, Value);
        arr[key]=Value;
        
    }
    
}
