class Main {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4,5,6};

        int len = arr.length;
        int c = 1;

        // count unique elements
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1])
                c++;
        }

        int[] ans = new int[c];
        int x = 0;

        // store unique elements
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1])
                ans[x++] = arr[i];
        }

        // add last element
        ans[x] = arr[len - 1];

        // print result
        for (int z : ans)
            System.out.print(z + " ");
    }
}
