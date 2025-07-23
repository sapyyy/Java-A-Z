import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        // example of exception
        Scanner sc = new Scanner(System.in);

        int a = 5;

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        // division by zero
        try {
            // performing division and then printing that number
            int c;
            c = a/b; // when divided by zero throws arithmetic exception
            System.out.println("The value of c : "+c);
        } catch (ArithmeticException e) {
            System.out.println("The number can't be divided with zero");
        }
    }
}
