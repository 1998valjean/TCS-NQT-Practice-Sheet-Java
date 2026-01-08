class Main {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int n=2;
        System.out.println("Left rotation: ");
        
        for(int i=n;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        
        System.out.println("\nRight rotation: ");
        
        for(int i=a.length-n;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length-n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
