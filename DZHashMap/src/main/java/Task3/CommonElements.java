package Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CommonElements {
    public static int[] common(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> count1 = new HashMap<>();
        HashMap<Integer, Integer> count2 = new HashMap<>();

        for (int num : nums1) {
            count1.put(num, count1.getOrDefault(num, 0) + 1);
        }
        for (int num : nums2) {
            count2.put(num, count2.getOrDefault(num, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();

        for (int k : count1.keySet()){
            if (count2.containsKey(k)){
                int minCount = Math.min(count1.get(k), count2.get(k));
                for (int i = 0; i < minCount; i++){
                    res.add(k);
                }
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < result.length; i++){
            result[i] = res.get(i);
        }
        return result;
    }
}
