import java.util.Arrays;
import java.util.List;

public class prob4 {

    private static final List<String> fruits = Arrays.asList(
            "apple",
            "kiwi",
            "banana",
            "melon",
            "orange",
            "pineapple",
            "cherry",
            "grape",
            "pear",
            "cucumber"
    );

    public static String getFruitName(int n) {
        if (n < 10) {
            return fruits.get(n);
        }

        int sumOfDigits = calculateSumOfDigits(n);
        int number = n - sumOfDigits;

        return getFruitName(number);
    }

    private static int calculateSumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

}
