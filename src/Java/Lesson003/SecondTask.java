package Java.Lesson003;

import java.util.ArrayList;
import java.util.List;

public class SecondTask {
    static List<String> ans = new ArrayList<>();
    static List<Integer> indexes = new ArrayList<>();

    public static List<String> findDigits(String s) {
        char[] charArr = s.replaceAll(" ", "").toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '?') indexes.add(i);
        }
        helper(0, charArr);
        return ans;
    }

    public static void helper(int indexNumber, char[] arrChar) {
        if (indexNumber == indexes.size()) {
            testExp(arrChar);
            return;
        }
        for (int i = 0; i < 10; i++) {
            arrChar[indexNumber] = (char) (i + 48);
            helper(indexNumber + 1, arrChar);
        }
    }
    public static void  testExp(char[] expChars) {
        String[] testStrings = expChars.toString()
                                        .replace('+', '=')
                                        .split("=");
        System.out.println(testStrings[0]);
//        if (Integer.parseInt(testStrings[0]) + Integer.parseInt(testStrings[1])
//        == Integer.parseInt(testStrings[2])) {
//            StringBuilder sb = new StringBuilder();
//            sb.append(testStrings[0]);
//            sb.append('+');
//            sb.append(testStrings[1]);
//            sb.append('=');
//            sb.append(testStrings[2]);
//            ans.add(sb.toString());
//        }
    }


    public static void main(String[] args) {
        System.out.println(findDigits("2? + ?5 = 69"));
    }
}
