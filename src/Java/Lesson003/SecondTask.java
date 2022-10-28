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
        int[] exp = new int[3];
        for (int index = 0; index < 3; index++) {
            exp[index] = Integer.parseInt(exprStr[index]);
        }
        if (exp[0] + exp[1] == exp[2]) {
            StringBuilder sb = new StringBuilder();
            sb.append(exprStr[0]);
            sb.append("+");
            sb.append(exprStr[1]);
            sb.append("=");
            sb.append(exprStr[2]);
            ans.add(sb.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println(findDigits("2? + ?5 = 69"));
    }
}
