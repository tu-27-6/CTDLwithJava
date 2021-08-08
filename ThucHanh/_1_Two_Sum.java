package ThucHanh;
import java.util.Arrays;

public class _1_Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoSum(arr, 8)));
    }
}
