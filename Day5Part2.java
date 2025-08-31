class CalculatorAdd {
    // method overloading
    public int add(int a, int b) {
        return a+b;
    }

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    public int add(int a, int b, int c, int d) {
        return add(a, b, c) + d;
    }
}


public class Day5Part2 {
    public static void main(String[] args) {
        CalculatorAdd calc2 = new CalculatorAdd();

        System.out.println(calc2.add(50, 80));

        System.out.println(calc2.add(50, 80, 90));

        System.out.println(calc2.add(50, 80, 90, 100));
    }
}
