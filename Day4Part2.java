class Calculator {
    // instance variables
    int a;
    int b;
}

class UCOBank {
    private int amount = 599;

    // withdraw
    public boolean withdraw(int val) {
        // COMPLEX?
        if (amount > 0) {
            if (val <= amount) {
                amount = amount - val;
                System.out.println("Withdraw successfull");
                return true;
            }
            else {
                System.out.println("Not enough balance");
                return false;
            }
        }
        else {
            System.out.println("NO BALANCE!");
        }

        return false;
    }

    // display the balance
    public void display() {
        System.out.println("The available balance is : " + amount);
    }
}

class Animal {
    static String name;
    int eyes;
    int legs;
    static boolean breathe = true;

    // breathe
    public static void breathe(){
        System.out.println(name + " is breathing");
    }

    // eat
    public void eat() {
        System.out.println(name + " is eating");
    }

    // walk
    public void walk() {
        System.out.println(name + " is walking");
    }
}

public class Day4Part2 {
    public static void main (String[] args) {
        Calculator cal = new Calculator();

        // creation of an object
        Animal cat = new Animal();
        cat.name = "Cat";
        cat.eyes = 2;
        cat.legs = 4;
        Animal.breathe();
        cat.eat();

        // bad way of doing it
        int catEyes = 2;
        int catLegs = 4;

        Animal dog = new Animal();
        dog.name = "Dog";
        dog.eyes = 2;
        dog.legs = 4;
        Animal.breathe();
        dog.eat();

        // bad way of doing it
        int dogEyes = 2;
        int dogLegs = 4;

        // creating an account of UCOBank
        UCOBank adrij = new UCOBank();
        System.out.println(adrij.withdraw(200));
    }
}
