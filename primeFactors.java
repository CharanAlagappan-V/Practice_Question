import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter the number");
        int b = sc.nextInt();

//        Map<Integer,Integer> map = findPrimeCount(b);
//        int sum = 0;
//        for(Map.Entry<Integer,Integer> e : map.entrySet()){
//            if(e.getKey()<a.length){
//                sum =sum+(a[e.getKey()]*e.getValue());
//            }
//        }
        System.out.println(findPrimeCount(b,a));
    }

    public static int findPrimeCount(int num,int[] a){
        int res =0;
        for(int i=2;i<=num;i++){
            int count =0;
            if(isPrime(i)) {
                while (num % i == 0) {
                    count++;
                    num = num / i;
                }
            }
            res = res + a[i]*count;
        }
        return res;
    }

//    public static Map<Integer,Integer> findPrimeCount(int num){
//
//        Map<Integer,Integer> map = new HashMap<>();
//
//        for(int i=2;i<=num;i++){
//            if(isPrime(i)) {
//                int count =0;
//                while (num % i == 0) {
//                    map.put(i, map.getOrDefault(i, 0) + 1);
//                    num = num / i;
//                }
//            }
//        }
//        return map;
//    }

    public static boolean isPrime(int a){

        if (a <= 1) {
            return false;
        }

        boolean res = true;

        for(int i=2; i*i<a;i++){
            if(a%i==0)
                return false;
        }

        return res;
    }
}
