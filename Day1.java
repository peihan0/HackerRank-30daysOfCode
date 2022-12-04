import java.io.*;
import java.util.*;

public class Solution {
    static int i = 4;
    static double d = 4.0;
    static String s = "HackerRank ";

    public static void main(String[] args) {
    /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int num1 = 0;
        double num2 = 0;
        String str;

        num1 = scn.nextInt();
        num2 = scn.nextDouble();
        scn.nextLine();
        str = scn.nextLine();

        i += num1;
        d += num2;
        s += str;

        System.out.println(i);
        System.out.println(String.format("%.1f", d));
        System.out.println(s);
    }
}
