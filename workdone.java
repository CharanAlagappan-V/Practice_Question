import java.util.Scanner;

public class workdone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] a = new int[n];
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int lcmXY = findLcmArr(a);

        int q =0;
        for(int i=0;i<a.length;i++){
            q = q + (lcmXY/a[i]);
        }

        Double res = lcmXY/(double)q;
        System.out.println(res);
    }

    public static int findLcmArr(int[] a){ // 6,2
        int res = a[0];
        for(int i=1;i<a.length;i++){
            res = findLcm(res,a[i]);
        }

        return res;
    }



    public static int findLcm(int a,int b){
        return (a*b)/findGcd(a,b);
    }

    //brute force lcm

//    public static int findLcm(int[] a){
//        int res =
//        while(true){
//            if(res%a==0 && res%b ==0)
//                break;
//            res++;
//        }
//        return res;
//    }

    //GCD
    public static int findGcd(int a, int b){
        while(a%b!=0){
            int rem = a%b;
            a=b;
            b=rem;
        }
        return b;
    }
}
