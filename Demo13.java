import java.util.HashSet;
import java.util.Set;

public class Demo13 {
    public static void main(String[] args) {
        int[] nums = {4,5,6,4,4};

//        int count = 0;
//        int start = 0;
//        int checker = 0;
//        Set<Integer> set = new HashSet<>();
//        for(;start<nums.length;start++){
//            if(set.contains(nums[start])) {
//                checker = checker + 3;
//                count++;
//                start = checker -1;
//                set = new HashSet<>();
//            }else{
//                set.add(nums[start]);
//            }
//        }
//
//        System.out.println(count);

        System.out.println(findMinOperations(nums));

    }

    public static int findMinOperations(int[] arr){
        int n = arr.length;

        for(int ops = 0; ops*3 <= n; ops++){
            boolean distinct = true;
            Set<Integer> set = new HashSet<>();

            for(int i=ops*3;i<n;i++){
                if(!set.add(arr[i])){
                    distinct = false;
                    break;
                }
            }
            if(distinct)
                return ops;

        }
        return (n+2)/3;
    }
}
