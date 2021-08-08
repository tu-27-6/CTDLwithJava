package ThucHanh;
public class _1295_Find_Number {
    public static int findNumbers(int[] nums) {

        int count = 0;

        for(int a : nums) {
            int digits = FDigits(a);

            if(digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public int Cach2(int[] nums) {
        int count = 0;

        for(int a : nums) {
            int digits = (int)Math.log10(a) + 1;
            if(digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    private static int FDigits(int a) {
        int count = 0;
        int temp = a;

        while(temp > 0) {
            temp /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {


    }

}
