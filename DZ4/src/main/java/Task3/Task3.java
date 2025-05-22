package Task3;

import java.util.Arrays;

public class Task3 {
    public static String largestNumber(int[] num){
        String[] arr = new String[num.length];
        for (int i = 0; i < num.length; i++) {
            arr[i] = String.valueOf(num[i]);
        }
            Arrays.sort(arr,(a,b) -> (b + a).compareTo(a + b));
            if (arr[0].equals("0")){
                return "0";
            }
        return String.join("",arr);
    }
}
