import java.util.Random; 

public class GetRandom {
    
    public GetRandom() {
        
    }
    
    public double returnArray() {
        Random rand = new Random(); // creating Random object
        double [] array_sizes = {50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};
        int elems = 50000;
        while (elems <=500000) {
            double [] arr = new double[elems];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rand.nextInt();
            }
            return arr;
        }
       
    }
    
    public static void main(String [] args) {
        GetRandom array = new GetRandom();
        array.returnArray();
    }
    // public static void main(String[] args) {
    //     Random rand = new Random(); // creating Random object
    //     double [] array_sizes = {50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};
    //     int elems = 50000;
    //     while (elems <=500000) {
    //         double [] arr = new double[elems];
    //         for (int i = 0; i < arr.length; i++) {
    //             arr[i] = rand.nextDouble(); // storing random integers in an array
    //             System.out.println(arr[i]); // printing each array element
    //         }
    //     }
    // }
    
}   
   
