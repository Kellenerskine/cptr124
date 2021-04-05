package classCode.chapt7;
import java.util.Random;

public class GCD_CompareWithStopwatch {
    
	private static final Random rand = new Random();
    
    /**
     * Creates and returns an array of random integers with 
     * a random size specified by the client
     * @param maxSize the number of elements in the array will be
     *        in the range 0...mxSize - 1
     * @param maxElement each element is chosen from the range
     *        0...maxElement - 1
     * @return the array of random integers
     */
    public static int[] makeRandomArray(int maxSize, int maxElement) {
        int[] result = new int[rand.nextInt(maxSize)];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(maxElement);
        }
        return result;
    } 
    
    
    // This works only for non-negative integers
    private static int gcd1(int m, int n) {
        // This is NOT an ideal implementation
        int smaller = (m < n) ? m : n;
        int factor = 1;
        for (int i = 2; i <= smaller; i++) {
            if (m % i == 0 && n % i == 0) {
                factor = i;
            }
        }
        return factor;
    }

    // This works only for non-negative integers
    private static int gcd2(int m, int n) {
        // This is MUCH BETTER implementation
        if (m == 0) {
            return n;
        }
        return gcd2(n % m, m);
    }
    
    public static void main(String[] args) {
        int[] arr = makeRandomArray(50000, 1000000);
        
        Stopwatch timer = new Stopwatch();
        
        // Time gcd1
        timer.start();
        for (int i = 1; i < arr.length; i++) {
            gcd1(arr[i - 1], arr[i]);
        }
        timer.stop();
        System.out.println(">>> gcd1 time: " + timer.elapsed() 
                           + " sec");

        // Time gcd2
        timer.start();
        for (int i = 1; i < arr.length; i++) {
            gcd2(arr[i - 1], arr[i]);
        }
        timer.stop();
        System.out.println(">>> gcd2 time: " + timer.elapsed() 
                           + " sec");

    }

}