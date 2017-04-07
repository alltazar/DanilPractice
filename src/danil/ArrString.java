package danil;

import java.util.LinkedList;

public class ArrString {
    public int arrString(String[] arr, String s){
        int l = arr.length;
        int sl = s.length();
        int count = 0;
        LinkedList<String> arr2 = new LinkedList<String>();
        for (int i = 0; i<l; i++) {
            if (arr[i].length() == sl && arr[i].equals(s)) {
                arr2.add(String.valueOf(arr[i]));
                count = i;
            }
        }
        if (arr2.size() == 0){
            return -1;
        }
        else {
            return count;
        }
    }
}
