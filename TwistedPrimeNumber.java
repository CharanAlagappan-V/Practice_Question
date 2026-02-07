import java.util.Scanner;

public class TwistedPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isPrime(a) && isPrime(reversed(a)))
            System.out.println("Twisted prime number");
        else
            System.out.println("Not a twisted Prime");
    }

    public static boolean isPrime(int a){

        if(a<2) return false;

        for(int i=2;i*i<a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }

    public static int reversed(int a){
        int rev = 0;
        while(a>0){
            int rem = a%10;
            rev = rev*10+rem;
            a=a/10;
        }
        return rev;
    }
}
