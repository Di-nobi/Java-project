import java.io.*;
import java.util.*;

class Positive_negative {
    public static void main(String args[]) {
        int number = (int) (Math.random() * 10);
        if (number > 0) {
            System.out.println(number + " is positive");
        }

        else if (number == 0) {
            System.out.println(number + " is zero");
        }

        else {
            System.out.println(number + " is negative");
        }
    }
}