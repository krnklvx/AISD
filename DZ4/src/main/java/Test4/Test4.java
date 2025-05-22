package Test4;

import java.util.Arrays;

public class Test4 {
    public static int maxNumber(int[] nums, int s){
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for (int num : nums){
            if (sum + num <= s){
                sum += num;
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
