import java.util.*;
import java.io.*;

 class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy x = new XCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }

    int go(int args) {
        int arg = args * 2;
        return arg;
    }
}