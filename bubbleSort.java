import java.io.*;
// Bubble sort abstracted from Geeks for Geeks because I think it's more simplier than the one we did in class

public class bubbleSort implements Sorts {
    
    public void sort(double [] a) {
        int n = a.length; 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) { 
                    double temp = a[j]; 
                    a[j] = a[j+1]; 
                    a[j+1] = temp; 
                }
            }
        }
    }
    
    public static void main(String [] args) {
        bubbleSort ob = new bubbleSort(); 
        double arr[] = {64, 34, 25, 12, 22, 11, 90}; 
        ob.sort(arr); 
        int n = arr.length; 
        // for (int i=0; i<n; ++i) {
        //      System.out.println(arr[i] + " "); 
        // }
    }
    
  
}