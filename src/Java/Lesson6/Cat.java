package Java.Lesson6;

public class Cat {
    String name;
    String skinColor;
    int age;

    public Cat(String name, String skinColor, int age) {
        this.name = name;
        this.skinColor =skinColor;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("name: %s, skin color: %s, age: %d", name, skinColor, age);
    }

    @Override
    public boolean equals(Object obj) {
        Cat otherCat = (Cat) obj;
        return this.name.equals(otherCat.name)
                && this.skinColor.equals(otherCat.skinColor)
                && this.age == otherCat.age;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.skinColor.hashCode() + age;
    }
}
