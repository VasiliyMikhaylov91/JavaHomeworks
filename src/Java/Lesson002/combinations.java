package Java.Lesson002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinations {
    static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> combine(int n, int k) {
        Integer[] arr = new Integer[k];
        helper(0, n, arr);
        return ans;
    }

    private static void helper(int col, int max, Integer[] comb) {
        if (col != comb.length) {
            int start = (col != 0) ? comb[col - 1] + 1 : 1;
            for (int i = start; i <= max - (comb.length - 1 - col); i++) {
                comb[col] = i;
                helper(col + 1, max, comb);
                if (comb[comb.length - 1] != 0) {
                    ans.add(Arrays.asList(comb.clone()));
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}