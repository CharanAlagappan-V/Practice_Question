public class kadane {
    public static void main(String[] args) {
        int[] a = {-1,2,3,10,-4,7,2,-5};
        int sum=0;
        int max = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        for(int i=0;i<a.length;i++){
            if(sum ==0 )
                start =i;
            sum =sum+a[i];
            if(sum>max){
                max = sum;
                ansStart = start;
                ansEnd = i;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
        System.out.println(ansStart);
        System.out.println(ansEnd);
    }
}
