package Book;

public class Class3103 {
    public static int sum(int[] arr)
    {
// вернуть сумму по абсолютному значению всех чисел из массива arr
// - это значит что если там отрицальное число встретилось - то берёшь его абсолютное значение
        int sum = 0;
        if (arr.length == 1){
            sum = Math.abs(arr[0]);
            } else {
            for (int i = 0; i < arr.length; i++) {
            sum += Math.abs(arr[i]);
            }
        }
        return sum;
    }

//    public static int max(int[] arr)
//    {
//        // вернуть максимальное число из чисел которые в массиве arr
//    }
//
//    public static boolean isPrime(int n)
//    {
//        // вернуть true если число n простое, false в противном случае
//    }
}
