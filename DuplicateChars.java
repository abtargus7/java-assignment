// Write a Java Program to find the duplicate characters in a string.


import java.util.HashMap;
import java.util.Map;

public class DuplicateChars {
    public static void main(String[] args) {
        String inputString = "hello world";

        Map<Character, Integer> charCountMap = new HashMap<>();

        inputString = inputString.toLowerCase();

        for (char c : inputString.toCharArray()) {
            if (c == ' ') {
                continue;
            }

            Integer count = charCountMap.get(c);

            if (count == null) {
                charCountMap.put(c, 1);
            } else {
                charCountMap.put(c, count + 1);
            }
        }

        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
