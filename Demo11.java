import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo11 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,5,5,108,3,1};
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int val =1;
        Set<Integer> newSet = new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!newSet.contains(arr[i]))
                newSet.add(arr[i]);
            else {
                while(set.contains(val)) {
                    val++;
                }
                arr[i] = val;
                set.add(val);
                val++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
