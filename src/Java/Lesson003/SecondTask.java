package Java.Lesson003;

import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    static List<String> ans = new ArrayList<>();
    static List<Integer> indexes = new ArrayList<>();
    static char[] charArr;

    public static List<String> findDigits(String s) {
        charArr = s.replaceAll(" ", "").toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '?') indexes.add(i);
        }
        char[] combArray = new char[indexes.size()];
        helper(0, combArray);
        return ans;
    }

    public static void helper(int indexNumber, char[] combArr) {
        if (indexNumber == indexes.size()) {
            addValid(combArr);
            return;
        }
        for (int i = 0; i < 10; i++) {
            combArr[indexNumber] = (char) (i + 48);
            helper(indexNumber + 1, combArr);
        }
    }

    public static void addValid(char[] combination) {
        int i = 0;
        for (int index : indexes) {
            charArr[index] = combination[i++];
        }
        String s = new String(charArr);
        String[] exprStr = s.replace("+", "=").split("=");
        int firstAdd = Integer.parseInt(exprStr[0]);
        int secondAdd = Integer.parseInt(exprStr[1]);
        int result = Integer.parseInt(exprStr[2]);
        if (firstAdd + secondAdd == result) {
            ans.add(String.format("%d + %d = %d", firstAdd, secondAdd, result));
        }
    }

    public static void main(String[] args) {
        System.out.println(findDigits("2? + ?5 = 69"));
    }
}
