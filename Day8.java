
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        HashMap<String, Integer> pBook = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            pBook.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (pBook.containsKey(s)) {
                System.out.println(s + "=" + pBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
