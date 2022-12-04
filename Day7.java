
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                int cur = arr.get(i);
                System.out.print(cur);
            } else {
                int cur = arr.get(i);
                System.out.print(" " + cur);

            }

        }

        bufferedReader.close();
    }
}
