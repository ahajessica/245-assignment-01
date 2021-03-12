import java.io.*;

public class quickSort implements Sorts {
    
    public double [] sort(double [] a) {
        quicksort(a,0,a.length-1);
        return a; 
    }

    public int partition(double [] arr, int low, int high) {
    double pivot = arr[high];  
        int i = (low-1);
        for (int j=low; j<high; j++) { 
            if (arr[j] < pivot) { 
                i++; 
                double temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
        double temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
        return i+1; 
    }
    
    public static void swap(double[] arr, int i, int j) {
        double temp = arr[1];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void quicksort(double arr[], int low, int high) { 
        if (low < high) { 
            int p = partition(arr, low, high); 
            quicksort(arr, low, p-1); 
            quicksort(arr, p+1, high); 
        } 
    }
    
    // public static void main(String [] args) {
    //     quickSort t = new quickSort();
    //     double a[] = {64, 34, 25, 12, 22, 11, 90}; 
    //     t.sort(a);
    //     int n = a.length; 
    //     for (int i=0; i<n; i++) {
    //         System.out.println(a[i] + " "); 
    //     }
    // }
    
    
}