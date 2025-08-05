class Dog {
    // instance variable
    String name;

    // methods
    public void bark() { // access_specifier -> return type -> method_name(optional parameters)
        System.out.println(name + " says Woof!");
    }
}

public class Day3Part2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Bhulbhuli";
        dog1.bark();
    }
}
