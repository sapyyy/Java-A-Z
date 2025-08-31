public class Day4 {
    public static void main(String[] args) {
        // WAP to find the largest among 3 numbers using if-else-if.
        int a = -83;
        int b = -74;
        int c = -3;

        int max = Integer.MIN_VALUE;
        // just for checking the greater element between two variables
        if (a > b) {
            max = a;
        }
        else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println(max);
    }
}
