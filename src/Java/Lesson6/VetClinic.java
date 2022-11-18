package Java.Lesson6;

import java.util.HashSet;
import java.util.Set;

public class VetClinic {
    static Set<Cat> cats = new HashSet<>();
    public static void main(String[] args) {
        Cat cat1 = new Cat("Basil", "Gray", 3);
        Cat cat2 = new Cat("Basil", "Gray", 3);
        Cat cat3 = new Cat("Monk", "White", 1);
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.equals(cat3));
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        for (var item : cats) {
            System.out.println(item);
        }
    }
}
