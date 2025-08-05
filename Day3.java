public class Day3 {
    public static void addThreeNums(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void main(String[] args) {
        // greatest number out of two numbers
//        int a = 1000;
//        int b = 5;
//        int greater = 0;
//
//        if (a > b) {
//            System.out.println("A is greater than B");
//        }
//        else if (b > a) {
//            System.out.println("B is greater than A");
//        }
//        else {
//            System.out.println("A and B is equal");
//        }
//
//
//        if (a > b) { // 1000 > 5 == true
//            greater = a;
//            System.out.println("first if");
//        }
//        if (b > a) { // false
//            greater = b;
//            System.out.println("second if");
//        }
//        if (b == a) {
//            greater = b;
//            System.out.println("third if");
//        }
//
//        System.out.println(greater);
//        for (int i=1; i<=10; i++) {
//            System.out.println(i);
//        }

        // while
//        int i = 1; // initialization
//        while (i<=10) { // condition
//            System.out.println(i); // code to execute
//            i++; // increment/decrement
//        }

        // do - while
//        int i = 0; // initialization
//        do {
//            // statements
//            System.out.println(i);
//
//            // increment / decrement
//            i++;
//        }
//        while (i > 0); // condition

        // DRY : Do not Repeat Yourself
    addThreeNums(3, 2, 8);
    addThreeNums(7, 93, 90);
    addThreeNums(1000, 84, 100);
    }
}
