package Java.Lesson002;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static List<List<Integer>> combine(int n, int k) {
        List<Integer> pattern = new ArrayList<>();
        for (int i = 1; i <= k; i++) pattern.add(i);
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.copyOf(pattern));
        int anchor = k - 1;
        int i = k;
         do {
            if (i != n) {
                i++;
                pattern.set(anchor, i);
                result.add(List.copyOf(pattern));
            }
            else {
                anchor--;
                i = pattern.get(anchor);
            }
        } while (i != n - k);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}
