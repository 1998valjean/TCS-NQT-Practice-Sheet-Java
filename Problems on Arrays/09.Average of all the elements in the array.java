class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,5,1};
        double sum = 0;

        for (int x : arr) sum += x;

        double avg = Math.round((sum / arr.length) * 100.0) / 100.0;
        System.out.println("Average of elements in the array: " + avg);
    }
}

//ans: 1.83
