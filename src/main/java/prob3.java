public class prob3 {

    public static int countStairs(int n) {
        if (n <= 2) {
            return n;
        }
        return countStairs(n - 1) + countStairs(n - 2);
    }
}
