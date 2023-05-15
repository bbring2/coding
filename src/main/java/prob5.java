public class prob5 {

    public static int getOddIndex(int[] arr) {
        int oddCount = 0, evenCount = 0;
        int oddIndex = -1, evenIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
                evenIndex = i;
            } else {
                oddCount++;
                oddIndex = i;
            }
        }

        if (oddCount == 1) {
            return oddIndex;
        } else
            return evenIndex;
    }
}
