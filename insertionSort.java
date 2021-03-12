import java.io.*;

public class insertionSort implements Sorts {
    
    public double [] sort(double [] a) { 
        int n = a.length; 
        for (int i = 1; i < n; ++i) { 
            double temp = a[i]; 
            int j = i - 1; 
            while (j >= 0 && a[j] > temp) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = temp; 
        }
        return a;
    }

    // public static void main(String [] args) {
    //     insertionSort t = new insertionSort();
    //     double arr[] = {64, 34, 25, 12, 22, 11, 90}; 
    //     t.sort(arr);
    //     int n = arr.length; 
    //     for (int i=0; i<n; ++i) {
    //         System.out.println(arr[i] + " "); 
    //     }
    // }
}