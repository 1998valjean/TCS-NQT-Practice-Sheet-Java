class Main {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int len = arr.length;
        int[] revArr = new int[len];

        for (int i = 0; i < len; i++) {
            revArr[i] = arr[len - 1 - i];
        }

        for (int e : revArr)
            System.out.print(e + " ");
    }
}
