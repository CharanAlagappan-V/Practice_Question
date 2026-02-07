import java.util.Arrays;

public class FactorBasedSorting {
    public static void main(String[] args) {
        int[] a = {8,2,3,12,16};
        System.out.println(Arrays.toString(sort(a)));
    }

    public static int[] sort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(counter(a[j])<counter(a[j+1])){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    public static int counter(int a){
        int count = 0;
        for(int i=1;i<=a;i++){
            if(a%i==0){
                count++;
            }
        }
        return count;
    }
}
