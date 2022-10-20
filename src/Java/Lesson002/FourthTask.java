package Java.Lesson002;

public class FourthTask {
    public int climbStairs(int n) {
        return findPath(n, 1, 2);
    }
    private static int findPath(int top, int first, int second) {
        if (top == 2) return second;
        if (top == 1) return first;
        return findPath(top - 1, second, first + second);
    }
}
