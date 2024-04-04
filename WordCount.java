// Write a Java Program to count the number of words in a string using HashMap.


import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "Abhishek";

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        String[] words = inputString.split("\\s+");

        for (String word : words) {
            Integer count = wordCountMap.get(word);

            if (count == null) {
                wordCountMap.put(word, 1);
            } else {
                wordCountMap.put(word, count + 1);
            }
        }

        System.out.println("Word Counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}
