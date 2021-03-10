
public class mergeSort {
    
    
    public double [] merge (double [] left, double [] right, double [] target) {
        int l = 0, r = 0, t = 0;
        // runs through all the items that are in the array that are in bounds
        while (t < target.length) {
            if (left[l] < right[r]) {
                target[t++] = left[l++];
            } else {
                target[t++] = right[r++];
            }
        }
        //once the loop is out of bounds either the left will be out of bounds or the right
        // this while loop is for when l is out of bounds
        while (l < left.length) {
            target[t++] = left[l++];
        }
        // this while loop is out of bounds for r and will add the remaining values 
        while (r < right.length) {
            target[t++] = right[r++];
        }
        return target;
    }
    
    public double [] get_left(double [] arr) {
        int size = arr.length/2;
        double [] left = new double[size];
        for (int i = 0; i < size; i++) {
            left[i] = arr[i];
        }
        return left;
    }
    
    public double [] get_right(double [] arr) {
        int size = 1-arr.length/2;
        double [] right = new double[size];
        for (int i = 0; i < size; i++) {
            right[i] = arr[i];
        }
        return right;
    }
    
    public void mergesort(double [] arr) {
        if (arr.length > 1) {
            double [] left = get_left(arr);
            double [] right = get_right(arr);
            
            mergesort(left);
            mergesort(right);
            merge(arr,left,right);
        }
    }
    
    public static void main(String[] args) {
        double [] left = new double [] {25.0, 38.0, 54.0,59.0};
        double [] right = new double [] {27.0, 39.0, 65.0,84.0};
        double [] target = new double [] {left.length + right.length};
        
        mergeSort example1 = new mergeSort();
        example1.mergesort(target);
    }
}



