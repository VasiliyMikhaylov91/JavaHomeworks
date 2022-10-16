package Java.Lesson001;

public class ThirdTask {
    public String reverseWords(String s) {
        StringBuilder revSent = new StringBuilder();
        int len = s.length() - 1;
        int mark = len;
        int markEnd = mark;
        while (mark >= 0) {
            while (mark >= 0 && s.charAt(mark) != ' ') {
                mark--;
            }
            if (mark != len && (mark + 1 != markEnd || s.charAt(mark + 1) != ' ')) {
                revSent.append(s.substring(mark + 1, markEnd + 1));
                revSent.append(' ');
            }
            while (mark >= 0 && s.charAt(mark) == ' ') mark--;
            markEnd = mark;
        }
        return revSent.toString().substring(0, revSent.length() - 1);
    }
}
