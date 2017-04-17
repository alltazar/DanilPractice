public class Main {

    public static void main(String[] args) {
        int[] arr = {5, 12, 22, 23, 26, 31, 35, 46, 51, 56};
        int x = 56;

        System.out.println(binarySearch(arr, x));
    }

    public static int binarySearch(int[] a, int b){
        int start = 0;
        int end = a.length -1;
        int middle = (end-start)/2;

        int c = 0;

        while (start!=end){
            if (a[(end+start)/2] == b){
                c = (end+start)/2;
                break;
            } else if (a[end] == b) {
                c = end;
                break;
            } else if (a[(end+start)/2] > b) {
                end = (end+start)/2;
            } else {
                start = (end+start)/2;
            }
        }

        return c;
    }
}
