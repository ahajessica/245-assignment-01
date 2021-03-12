import java.util.*;
import java.lang.*;
import java.lang.String;
import java.io.*;

public class selectionSort implements Sorts {

    public double [] sort(double[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            swap(a, i, findmin(a, i));
        }
        return a; 
    }

    public int findmin(double[] a, int start) {
        int min=start;
        for(int i = (start+1); i < a.length; i++) {
            if(a[i] < a[min]) {
                min = i;
            }
        }
        return min;
    }

    public void swap(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    // public static void main(String [] args) {
    //     selectionSort example = new selectionSort();
    //     double[] numbers = {7,21,45,67,3};
    //     example.sort(numbers);
    //     // for(int i = 0; i < numbers.length; i++) {
    //     //     System.out.println("Number: " + numbers[i] + "\n");
    //     // }
    // }

}