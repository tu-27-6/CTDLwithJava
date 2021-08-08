package ThucHanh;

public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        char[] a = s.toCharArray();
        int[] count = new int[200];

        for(int i = 0; i < a.length; i++) {
            int c = (int)a[i];
            count[c]++;
        }

        for(int i = 0; i < a.length; i++) {
            int c = (int)a[i];
            if(count[c] == 1) {
                return i;
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
       String s = "leetcode";

       System.out.println(firstUniqChar(s));
    }
}
