import java.util.*;
import java.io.*;

class Clock {
    String time;

    String getTime() {
        return time;
    }

    void setTime(String t) {
        time = t;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Clock c = new Clock();
        c.setTime("12.45");
        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}