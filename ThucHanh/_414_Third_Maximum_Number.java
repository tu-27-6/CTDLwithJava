package ThucHanh;

public class _414_Third_Maximum_Number {
    public static void insert(long[] maxArr, int val) {
        int i = 0;
        while(i < maxArr.length) {
            if(val == maxArr[i]) {
                return;
            }
            else if(val > maxArr[i]) {
                break;
            }
            else {
                i++;
            }
        }

        if(i < maxArr.length) {
            for(int j = 1; j >= i; j--) {
                 maxArr[j + 1] = maxArr[j];
            }
            maxArr[i] = val;
        }
    }

    public static int thirdMax(int[] nums) {     
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for(int i = 0; i < nums.length; i++) {
            insert(maxArr, nums[i]);
            //5 3 4 2 1
        }

        if(maxArr[2] == Long.MIN_VALUE) { // 5 4 3
            return (int)maxArr[0];
        }
        
        return (int)maxArr[2];
    }

    public static void main(String[] args) {
        
    }
}
