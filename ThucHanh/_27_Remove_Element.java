package ThucHanh;
public class _27_Remove_Element {
//    public int removeElement(int[] nums, int val) {
//        int n = nums.length;
//
//        for(int i = 0; i < n;) {
//            if(nums[i] == val) {
//                for(int j = i; j < n - 1; j++) {
//                    nums[j] = nums[j +1];
//                }
//                n--;
//            }
//            else {
//                i++;
//            }
//        }
//
//        return n;
//    }

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
            }

        }
        return k;
    }




}
