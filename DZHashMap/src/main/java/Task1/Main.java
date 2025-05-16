package Task1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String text = "Яблоко яблоки яблоко яблоко мандарин";
        HashMap<String, Integer> result = Counter.countWords(text);
        System.out.println(result);
    }
}
