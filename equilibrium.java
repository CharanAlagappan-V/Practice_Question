public class equilibrium {
    public static void main(String[] args) {
        int[] a = {1,3,5,2,2};
//        int ind = -1;
//        for(int i=0;i<a.length;i++){
//            int Lsum = 0;
//            int Rsum = 0;
//            for(int j=0;j<i;j++){
//                Lsum = Lsum + a[j];
//            }
//            for(int j=a.length-1;j>i;j--){
//                Rsum = Rsum + a[j];
//            }
//            if(Lsum == Rsum){
//                ind = i;
//                break;
//            }
//        }
        int ind = findEquilibrium(a);
        if(ind!=-1)
            System.out.println(ind);
        else
            System.out.println("Not Found");
    }

    public static int findEquilibrium(int[] a){
        int totalsum =0;
        for (int j : a) {
            totalsum = totalsum + j;
        }
        int leftsum =0;
        for(int i=0;i<a.length;i++){
            totalsum = totalsum-a[i];
            if(totalsum == leftsum)
                return i;
            leftsum = leftsum+a[i];
        }
        return -1;
    }
}
