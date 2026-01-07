class Main  {
    public static void main(String[] args){
        int[] arr= {5,4,3,2,1};
        int s=0;
        
        for(int e: arr) 
        s+=e;
        
        System.out.print("Sum of elements in the array: "+s);
    }
}
