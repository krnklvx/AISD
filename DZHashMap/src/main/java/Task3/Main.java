package Task3;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2, 4, 5, 4, 1};
        int[] nums2 = {2, 2, 4, 5, 8};
        int[] result = CommonElements.common(nums1, nums2);
        System.out.print("[");
        for (int num : result){
            System.out.print(num + " ");
        }
        System.out.print("]");
    }
}
