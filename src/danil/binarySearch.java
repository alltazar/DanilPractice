public class BinarySearch {
    public static int binarySearch(int[] a, int b){
        int start = 0;
        int end = a.length -1;

        int c = -1;

        while (start!=end){
            if (a[(end+start)/2] == b){
                c = (end+start)/2;
                break;
            } else if (a[(end+start)/2] > b) {
                end = ((end+start)/2)-1;
            } else {
                start = ((end+start)/2)+1;
            }
        }

        return c;
    }
}
