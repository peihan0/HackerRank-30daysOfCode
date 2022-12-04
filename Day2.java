class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     * 1. DOUBLE meal_cost
     * 2. INTEGER tip_percent
     * 3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        int sum = (int) Math.round(meal_cost + meal_cost * tip_percent * 0.01 + meal_cost * tax_percent * 0.01);
        System.out.println(sum);

    }

}