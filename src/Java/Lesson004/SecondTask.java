package Java.Lesson004;

import java.util.Stack;

public class SecondTask {
    public int evalRPN(String[] tokens) {
        Stack<Integer> itemSt = new Stack<>();
        int first;
        int second;
        for (String item : tokens) {
            if ("+".equals(item)) {
                itemSt.push(itemSt.pop() + itemSt.pop());
            } else if ("-".equals(item)) {
                second = itemSt.pop();
                first = itemSt.pop();
                itemSt.push(first - second);
            } else if ("*".equals(item)) {
                itemSt.push(itemSt.pop() * itemSt.pop());
            } else if ("/".equals(item)) {
                second = itemSt.pop();
                first = itemSt.pop();
                itemSt.push(first / second);
            } else {
                itemSt.push(Integer.parseInt(item));
            }
        }
        return itemSt.pop();
    }
}
