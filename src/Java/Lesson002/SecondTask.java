package Java.Lesson002;

public class SecondTask {
    public static double myPow(double x, int n) {
        if (x > 3.4e+038) return  3.4e+038;
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n < 0) return (n % 2 == 0) ? myPow(1 / (x * x), -n / 2) : myPow(1 / (x * x), -n / 2) * 1 / x;
        return (n % 2 == 0) ? myPow(x * x, n / 2) : myPow(x * x, n / 2) * x;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000,10));
    }
}
