class Parent {
    String name;
    int age;

    Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayParent() {
        System.out.println("This is the parent's class");
    }
}

class Child extends Parent {
    int roll;

    Child(String name, int age, int roll) {
        super(name, age);
        this.roll = roll;
    }

    void display() {
        super.displayParent();
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.roll);
    }
}

public class Day5Part4 {
    public static void main(String[] args) {
        Parent parent = new Parent("Swapan", 60);
        Child child = new Child("Saptadeep", 32, 99);
        child.display();
    }
}
