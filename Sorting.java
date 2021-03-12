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
        GetRandom random_bubble = new GetRandom();
        double [] array = random_bubble.returnArray();
        start = System.currentTimeMillis();
        bubbleSort.sort(array);
        end = System.currentTimeMillis();
        long bubbleTime = start - end; 
        System.out.println("Time for Bubble Sort: " + bubbleTime);
       
        // //Insertion Sort//
        // System.out.println("\n Insertion Sort");
        // Sorts insetionSort = new insertionSort();
        // GetRandom random_insertion = new GetRandom();
        // double [] array = random_insertion.returnArray();
        // start = System.currentTimeMillis();
        // insertionSort.sort(array);
        // end = System.currentTimeMillis();
        // long insertionTime = start - end; 
        // System.out.println("Time for Insertion Sort: " + insertionTime);
       
        // //Merge Sort//
        // System.out.println("\n Merge Sort");
        // Sorts mergeSort = new mergeSort();
        // GetRandom random_merge = new GetRandom();
        // double [] array = random_merge.returnArray();
        // start = System.currentTimeMillis();
        // mergeSort.sort(array);
        // end = System.currentTimeMillis();
        // long mergeTime = start - end; 
        // System.out.println("Time for Merge Sort: " + mergeTime);
       
        // //Quick Sort//
        // System.out.println("\n Quick Sort");
        // Sorts quickSort = new quickSort();
        // GetRandom random_quick = new GetRandom();
        // double [] array = random_quick.returnArray();
        // start = System.currentTimeMillis();
        // quickSort.sort(array);
        // end = System.currentTimeMillis();
        // long quickTime = start - end; 
        // System.out.println("Time for Quick Sort: " + quickTime);
       
        // //Selection Sort// 
        // System.out.println("\n Selection Sort");
        // Sorts selectionSort = new selectionSort();
        // GetRandom random_selection = new GetRandom();
        // double [] array = random_selection.returnArray();
        // start = System.currentTimeMillis();
        // quickSort.sort(array);
        // end = System.currentTimeMillis();
        // long quickTime = start - end; 
        // System.out.println("Time for Bubble Sort: " + quickTime);
       
     
     }
 } 
 
