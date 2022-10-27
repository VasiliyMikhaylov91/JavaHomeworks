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
            // Начальный столбец начинаем с заполнять с 1,
            // другие с того числа, которым закончился предыдущий + 1
            int start = (col == 0) ? 1 : comb[col - 1] + 1;
            // Максимальное число в столбце максимальное возможно число минус длинна массива
            // плюс индекс этого столбца и плюс 1, потому что начинаем формировать комбинации с 1.
            int end = max - comb.length + col + 1;
            for (int i = start; i <= end; i++) {
                comb[col] = i;
                helper(col + 1, max, comb);
                if (col == comb.length - 1) ans.add(Arrays.asList(comb.clone()));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }
}