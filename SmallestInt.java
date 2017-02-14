package javabasics;
import static java.lang.Math.*;

public class SmallestInt {
    static int a;
    static int b;
    static int c;
    static int smallest;

    public static void main(String[] args) {
        System.out.println(getSmallestInt(23,43,1454));
    }

    public static int getSmallestInt(int a, int b, int c) {
        smallest = min(Math.min(a, b), c);
    return smallest;
    }
}
