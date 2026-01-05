import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3, 2, 1, 1};
        Arrays.sort(a);

        int l = a.length;

        for (int i = 0; i < l; i++) {
            int c = 1;

            // Count duplicates
            while (i < l - 1 && a[i] == a[i + 1]) {
                c++;
                i++;
            }

            System.out.println(a[i] + " " + c);
        }
    }
}
