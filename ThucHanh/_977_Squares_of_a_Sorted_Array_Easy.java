package ThucHanh;

import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array_Easy {


    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < 0) {
                nums[i] *= -1;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            nums[i] = (int)Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);
        return nums;
    }

    public int[] Cach2(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        int k = 0;
        int i = -1;

        while(i + 1 < n && nums[i + 1] < 0) {
            i++;
        }

        int j = n;
        while(j - 1 >= 0 && nums[j - 1] >= 0) {
            j--;
        }

        while(i >= 0 || j < n) {
            if(i >=0 && j < n) {
                int ii = nums[i] * nums[i];
                int jj = nums[j] * nums[j];

                if(ii <= jj) {
                    res[k] = ii;
                    i--; k++;
                }
                else {
                    res[k] = jj;
                    j++; k++;
                }
            }
            else if(i >= 0) {
                res[k] = nums[i] * nums[i];
                i--; k++;
            }
            else {
                res[k] = nums[j] * nums[j];
                j++; k++;
            }
        }

        return res;
    }
}
