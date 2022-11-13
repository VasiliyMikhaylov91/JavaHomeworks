package Java.Lesson005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourthTask {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap<>();
        for (String item : paths) {
            String[] arrayItem = item.split(" ");
            for (int i = 1; i < arrayItem.length; i++) {
                String[] fileAndContain = arrayItem[i].split("\\(");
                map.putIfAbsent(fileAndContain[1], new ArrayList<String>());
                List<String> adresses = map.get(fileAndContain[1]);
                adresses.add(String.format("%s/%s", arrayItem[0], fileAndContain[0]));
                map.put(fileAndContain[1], adresses);
            }
        }

        List<List<String>> ans = new ArrayList<>();
        for (String key : map.keySet()) {
            List<String> adresses = map.get(key);
            if (adresses.size() > 1) {
                ans.add(adresses);
            }
        }
        return ans;
    }
}
