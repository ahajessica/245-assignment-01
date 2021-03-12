import java.util.Random; 

public class GetRandom {
    
    public GetRandom() {
        
    }
    
    public double [] returnArray() {
        double [] array_sizes = {50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000, 500000};
        for (int i = 0; i < array_sizes.length; i++) {
            callRandom(array_sizes[i]);
        }
    }
    
    public double [] callRandom(double size) {
         Random rand = new Random(); 
         double [] array = new double[size];
         for (int i = 0; i < size; i++) {
                array[i] = rand.nextDouble();
            }
            return array; 
    }
    
    // public static void main(String [] args) {
    //     GetRandom array = new GetRandom();
    //   // array.returnArray();
    // }

}   
   
