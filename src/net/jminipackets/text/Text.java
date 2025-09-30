package net.jminipackets.text;

import java.util.*;

public class Text {
    public static int scanForWord(String text, String target) {
        String[] words = text.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }
    public static List<Map.Entry<String, Integer>> sortWordFrequency(String text) {
        String[] words = text.split("\\s+");
        Map<String, Integer> counts = new HashMap<>();

        for (String w : words) {
            counts.put(w, counts.getOrDefault(w, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sorted = new ArrayList<>(counts.entrySet());
        sorted.sort((a, b) -> b.getValue() - a.getValue());

        return sorted;
    }
}
