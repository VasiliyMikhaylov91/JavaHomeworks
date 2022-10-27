package Java.Lesson004;

import java.io.IOException;
import java.util.EmptyStackException;
import java.util.Stack;

public class FirstTask {
    public boolean isValid(String s) {
        int len = s.length();
        if (len % 2 == 1) return false;
        char[] inp = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for (char item : inp) {
            if ('(' == item || '[' == item || '{' == item) {
                st.push(item);
            } else {
                if (st.isEmpty()) return false;
                char par = st.pop();
                int dist = par == '(' ? 1 : 2;
                if (item != par + dist) return false;
            }
        }
        return st.isEmpty();
    }
}

