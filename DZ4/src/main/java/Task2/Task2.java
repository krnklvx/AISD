package Task2;

public class Task2 {
    public static String reverseWords(String s){
        char[] arr = s.trim().toCharArray();
        reverse(arr, 0, arr.length - 1);
        //разворот каждого слова
        int start = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == ' '){
                reverse(arr, start, i - 1);
                start = i + 1;
            }
        }
        reverse(arr, start, arr.length - 1);
        return new String(arr);
    }

    public static void reverse(char[]arr, int start, int end){
        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
