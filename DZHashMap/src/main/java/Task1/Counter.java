package Task1;

import java.util.HashMap;

public class Counter {
    public static HashMap<String, Integer> countWords(String text){
        HashMap<String, Integer> wordsCount = new HashMap<>();
        String[] words = text.split(" ");
        for (String word : words){
            word = word.toLowerCase();
            if (wordsCount.containsKey(word)){
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        return wordsCount;
    }
}