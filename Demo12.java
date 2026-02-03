import java.util.Arrays;

public class Demo12 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,2,1,7};
        Arrays.sort(nums);
        int moves = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int target = nums[i-1]+1;
                moves = moves + (target - nums[i]);
                nums[i] = target;
            }
        }
        System.out.println(moves);

    }
}
