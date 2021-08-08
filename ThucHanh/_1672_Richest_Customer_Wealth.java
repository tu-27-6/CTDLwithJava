package ThucHanh;

public class _1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] a) {
        int khachHang = a.length;
        int nganHang = a[0].length;
        int max = 0;

        for(int i = 0; i < khachHang; i++) {
            int sum = 0;

            for(int j = 0; j < nganHang; j++) {
                sum += a[i][j];
            } 

            if(sum > max) {
                max = sum;
            }
        }


        
        return max;
    }

    public static void main(String[] args) {
        String s = "HELLO";
  
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.println(c);
            }
        }

        
    }
}