import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements for the Array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxi = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > maxi) {
                maxi = arr[i];
            }
        }

        System.out.println("The largest element in the array is: " + maxi);
    }
}
