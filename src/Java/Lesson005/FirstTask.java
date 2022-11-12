package Java.Lesson005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstTask {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.putIfAbsent(nums2[i], 0);
            map.put(nums2[i], map.get(nums2[i]) + 1);
        }

        List<Integer> intsect = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                intsect.add(nums1[i]);
                map.put(nums1[i], map.get(nums1[i]) - 1);
                if (map.get(nums1[i]) == 0) {
                    map.remove(nums1[i]);
                }
            }
        }

        int[] ans = new int[intsect.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = intsect.get(i);
        }
        return ans;
    }
}
