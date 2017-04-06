package danil;

import java.util.HashSet;
import java.util.Set;

public class SetInSet {
    public Set<Set<Integer>> group(Set<Integer> nums){
        int l = nums.size();
        int k = 0;
        int[] arr = new int[l];
        int i = 0;
        Set<Integer> set = new HashSet<>();
        Set<Set<Integer>> setSet = new HashSet<>();
        for (Integer n : nums){
            arr[i] = n;
            i++;
        }
        while (k<l){
            set.add(arr[k]);
            k++;
            if (k<l) {
                while (arr[k] - arr[k - 1] < 3) {
                    set.add(arr[k]);
                    k++;
                }
            }
            setSet.add(set);
        }
        return setSet;
    }
}
