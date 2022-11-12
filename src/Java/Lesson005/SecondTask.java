package Java.Lesson005;

import java.util.HashMap;
import java.util.Map;

public class SecondTask {
    public int countWords(String[] words1, String[] words2) {
        if (words2.length > words1.length) {
            return countWords(words2, words1);
        }

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words2.length; i++) {
            map.putIfAbsent(words2[i], 0);
            map.put(words2[i], map.get(words2[i]) + 1);
        }

        for (int i = 0; i < words1.length; i++) {
            if (map.containsKey(words1[i])) {
                if (map.get(words1[i]) > 1) {
                    map.remove(words1[i]);
                } else {
                    map.put(words1[i], map.get(words1[i]) - 1);
                }
            }
        }

        int count = 0;
        for (String item : map.keySet()) {
            if (map.get(item) == 0) {
                count++;
            }
        }

        return count;
    }
}
