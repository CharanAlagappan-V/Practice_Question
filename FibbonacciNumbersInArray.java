import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibbonacciNumbersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        List<Integer> res = find(arr);
        System.out.println(res);
    }

    public static List<Integer> find(String[] a){
        List<Integer> list = new ArrayList<>();

        for(String str : a){
            int n = Integer.parseInt(str);
            if(isInFibbonacci(n))
                list.add(n);
        }
        return list;
    }

    private static boolean isInFibbonacci(int n) {

        int a = 0;
        int b = 1;

        while(a<=n){
            if(a==n) return true;
            int next = a+b;
            a=b;
            b=next;
        }
        return false;
    }
}
