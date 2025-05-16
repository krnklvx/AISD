package Task2;

import static Task2.CheckDublicates.containsDublicate;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 3};
        int k = 3;
        containsDublicate(nums, k);
    }
}
