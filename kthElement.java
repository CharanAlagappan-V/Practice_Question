import java.util.*;
public class kthElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 956781;
        int n =3;
        int res = findElementLtoR(a,n);
        System.out.println(res);
        int result = findElementRtoL(a,n);
        System.out.println(result);
    }

    public static int countDigits(int a){
        int count=0;
        while(a>0){
            count++;
            a=a/10;
        }
        return count;
    }

    public static int findElementLtoR(int a, int b){
        int digits = countDigits(a);
        if(b>digits || b<=0){
            return -1;
        }
        int res = a/(int)Math.pow(10,digits-b);
        return res%10;
    }

    public static int findElementRtoL(int a, int b){
        int res = a/(int)Math.pow(10,b-1);
        if(res == 0){
            return -1;
        }
        return res%10;
    }
}
