package Task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CheckDublicates {
    public static void containsDublicate(int[] nums, int k){
        HashMap<Integer, Integer> lastMention = new HashMap<>();
        List<String> results = new ArrayList<>();
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (lastMention.containsKey(num)) {
                int distance = i - lastMention.get(num);
                if (distance <= k) {
                    results.add("Число " + num + ": индексы " + lastMention.get(num) + " и " + i +
                            ", расстояние " + distance);
                    found = true;
                }
            }
            lastMention.put(num,i);
        }

        if (!found){
            System.out.println("false");
        } else {
            System.out.println("Найдены дубликаты для k = " + k + ":");
            for (String result : results){
                System.out.println(result);
            }
        }
    }
}
