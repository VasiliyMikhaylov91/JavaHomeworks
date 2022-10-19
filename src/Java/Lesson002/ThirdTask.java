package Java.Lesson002;

public class ThirdTask {
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        return (n % 2 != 0 || n == 0) ? false : isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
