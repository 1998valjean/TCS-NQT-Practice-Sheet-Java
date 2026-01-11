import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 3};
        Arrays.sort(arr);
        int len = arr.length;

        if (len % 2 == 0) {
            double median = (arr[len/2] + arr[len/2 - 1]) / 2.0;
            median = Math.round(median * 10.0) / 10.0;
            System.out.print(median);
        } else {
            System.out.print(arr[len/2]);
        }
    }
}
