public class BinarySearch {
    public static int binarySearch(int[] a, int b){
        int start = 0;
        int end = a.length -1;

        int c = -1;
        if (a.length == 0){
            return c;
        } else if (a.length <= 2){
            if (a[0] == b){
                c = 0;
                return c;
            } else if (a[1] == b){
                c = 1;
                return c;
            } else {
                return c;
            }
        }

        while (start!=end){
            if (a[(end+start)/2] == b){
                c = (end+start)/2;
                break;
            } else if (a[(end+start)/2] > b) {
                end = (end+start)/2 -1;
            } else {
                start = (end+start)/2 +1;
                if (a[(end+start)/2] == b) {
                    c = (end + start) / 2;
                    break;
                }
            }
        }

        return c;
    }
