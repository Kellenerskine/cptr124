package classCode.chapt7.testingArraySort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSort {

    @Test
    void testSort1() {
        int[] arr = {23, 67, 23, 4, 0, 120, 5};
        int[] sorted = {0, 4, 5, 23, 23, 67, 120};
        ArraySort.sort(arr);
        assertArrayEquals(sorted, arr);
    }
    
    @Test
    void testSortAlreadySorted() {
        int[] arr = {0, 4, 5, 23, 23, 67, 120};
        int[] sorted = {0, 4, 5, 23, 23, 67, 120};
        ArraySort.sort(arr);
        assertArrayEquals(sorted, arr);
    }
    
    @Test
    void testSortEmptyArray() {
        int[] arr = {};
        int[] sorted = {};
        ArraySort.sort(arr);
        assertArrayEquals(sorted, arr);
    }

    @Test
    void testSortOneElementArray() {
        int[] arr = {3};
        int[] sorted = {3};
        ArraySort.sort(arr);
        assertArrayEquals(sorted, arr);
    }
    
    @Test
    void testCountEvens1() {
        int[] arr = {0, 4, 5, 23, 23, 67, 120};
        int evens = ArraySort.countEvens(arr);
        assertEquals(3, evens);
        
    }

    @Test
    void testCountEvensEmpty() {
        int[] arr = {};
        int evens = ArraySort.countEvens(arr);
        assertEquals(0, evens);
        
    }

    @Test
    void testCountEvensOneOddElement() {
        int[] arr = {1};
        int evens = ArraySort.countEvens(arr);
        assertEquals(0, evens);
        
    }

    @Test
    void testCountEvensOneEvenElement() {
        int[] arr = {14};
        int evens = ArraySort.countEvens(arr);
        assertEquals(1, evens);
        
    }
}