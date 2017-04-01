package Book;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {
    @Test
    public void testSum(){
        int[] arr = {1,2,6,-4,5};
        assertEquals(18, Class3103.sum(arr));
        int[] arr1 = {-1};
        assertEquals(1, Class3103.sum(arr1));
        int[] arr2 = {-5,5,-3,-4,7};
        assertEquals(24, Class3103.sum(arr2));
        int[] arr3 = {1,2,3,-4,5};
        assertEquals(15, Class3103.sum(arr3));
    }
    @Test
    public void testMax(){
        int[] arr = {1,2,6,-4,5};
        assertEquals(6, Class3103.max(arr));
        int[] arr1 = {-1,3};
        assertEquals(3, Class3103.max(arr1));
        int[] arr2 = {-5,5,-3,-4,7};
        assertEquals(7, Class3103.max(arr2));
        int[] arr3 = {1,5,2,3,-4,5,3};
        assertEquals(5, Class3103.max(arr3));
    }
    @Test
    public void testPrime(){
        int n = 1;
        assertEquals(false, Class3103.isPrime(n));
        int n1 = 2;
        assertEquals(true, Class3103.isPrime(n1));
        int n2 = 12;
        assertEquals(false, Class3103.isPrime(n2));
        int n3 = 13;
        assertEquals(true, Class3103.isPrime(n3));
        int n4 = 25;
        assertEquals(false, Class3103.isPrime(n4));
        int n5 = 143;
        assertEquals(false, Class3103.isPrime(n5));
        int n6 = 79;
        assertEquals(true, Class3103.isPrime(n6));
        int n7 = 97;
        assertEquals(true, Class3103.isPrime(n7));
    }
}
