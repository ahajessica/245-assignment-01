import java.lang.System; 
import java.io.*;

public class Sorting {
    
    public Sorting() {
        
    }
 
    public static void main(String[] args) {
        
        long start; // start time for currenTimeMillis();
        long end; // end time for currentTimeMillis(); 
       
       
       // creates an array of random double instances
       //calls getRandom class and creates 10 arrays from array_sizes
       
       /** collects time of general sorting algorithms **/
       
       //Bubble Sort//
       System.out.println("\n Bubble Sort");
       Sorts bubbleSort = new bubbleSort();
       GetRandom random_array = new GetRandom();
       start = System.currentTimeMillis();
       bubbleSort.sort(random_array.returnArray());
       end = System.currentTimeMillis();
       long bubbleTime = start - end; 
       System.out.println("Time for Bubble Sort: " + bubbleTime);
       
       //Insertion Sort//
       
       //Merge Sort//
       
       //Quick Sort//
       
       //Selection Sort// 
       
        
        
     
     
     }
 } 
 
