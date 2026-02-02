import java.util.Scanner;

public class pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        while(n%y!=0){
            y++;
        }
        int sum =0;
        while(y!=0){
            int rem = y%10;
            sum =sum+rem;
            y=y/10;
        }
        System.out.println(sum);
    }
}
