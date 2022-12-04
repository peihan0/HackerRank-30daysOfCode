public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner scn = new Scanner(System.in);
        int times = scn.nextInt();
        scn.nextLine();
        while (times-- > 0) {
            String str = scn.nextLine();

            for (int i = 0; i < str.length(); i += 2) {
                System.out.print(str.charAt(i));
            }

            System.out.print(" ");

            for (int i = 1; i < str.length(); i += 2) {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
        }
        scn.close();
    }
}