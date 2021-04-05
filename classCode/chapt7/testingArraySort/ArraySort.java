package classCode.chapt7.testingArraySort;
import java.util.Arrays;
import java.util.Random;

public class ArraySort {
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
	
	/**
	 * Sorts an integer array into non-decreasing (ascending) order
	 * @param a the array to sort
	 */
	public static void sort(int[] a) {
		for (int i = 0; i< a.length - 1; i++) {
			int smallest = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[smallest]) {
					smallest = j;
				}
			}
			if (i != smallest) {
				int temp = a[i];
				a[i] = a[smallest];
				a[smallest] = temp;
			}
		}
		
	}
	
	/**
	 * Counts the number of even numbers in the array
	 * @param a the array to process
	 * @return the number even values in the array
	 */
	public static int countEvens(int[] a) {
	    int evenCount = 0;
	    for (int elem : a) {
	        if (elem % 2 == 0) {
	            evenCount++;
	        }
	    }
	    return evenCount;
	}

	public static void main(String[] args) {
		int[] arr = makeRandomArray(20, 100);
		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
