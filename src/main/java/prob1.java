import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class prob1 {

    public static String[] sortArr(String[] strArr) {
        return Arrays.stream(strArr)
                .distinct()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .toArray(String[]::new);
    }

}
