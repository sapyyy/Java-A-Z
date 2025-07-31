class UNOBank {
    // static variable
    static int accountCounts = 0;

    // constructor:
    // a method which is called only once at the time of the object creation
    UNOBank(){
        accountCounts++;
    }
}

public class Day2 {
    public static void main(String[] args) {
        /* Remove Whitespace
        Remove Whitespace: Write a program to remove all whitespace characters from a given string. */

        // Strings are immutable
        String str = "I am Saptadeep and today I am teaching JAVA";
        String result = "";

        for (int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            }

            result += ch;
        }

        System.out.println(result);

        /* Reverse a String: Write a program that takes a string as input and prints the string in reverse order. For example, if the input is "hello", the output should be "olleh".*/
        String str2 = "Reverse";
        String result2 = "";

        for (int i=str2.length() - 1; i>=0; i--) {
            char ch = str2.charAt(i);
            result2 += ch;
        }

        System.out.println(result2);

//        // creating objects of the Animals class
//        Animals dog = new Animals();
//        dog.eyes = 2;
//        dog.nose = 1;
//        dog.ears = 2;
//
//        Animals spider = new Animals();
//        spider.eyes = 8;
//        spider.nose = 1;
//        spider.ears = 2;

        UNOBank tatai = new UNOBank();
        UNOBank sapyyy = new UNOBank();
        UNOBank debanjan = new UNOBank();
        System.out.println(UNOBank.accountCounts);

        boolean prime = false;
        if (!prime) {
            System.out.println("the number is not prime");
        }
    }
}
