package it.DevelHope.ExerciseJava25;

public class Start {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = '2';

        boolean A = (55 != 55) && (false ^ true);          // Since the value of the first condition is false, the result will be false.
        boolean B = (!a || !b) || (c == d);                // Since the value of the first condition is true and the value of the second is false, the result will be true.
        boolean C = false && true || false && !false;      // Since the value of both condition is false, the result will be false.
        boolean D = ((false && true) || (false || true));  // Since the value of the first condition is false and the value of the second is true, the result will be true.

        System.out.println(" The result of A is: " + A);
        System.out.println(" The result of B is: " + B);
        System.out.println(" The result of C is: " + C);
        System.out.println(" The result of D is: " +D);

    }
}
