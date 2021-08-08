package LyThuyet;
public class merge {
    public static void main(String[] args) {
        int[] n1 = {1, 2, 3, 4};
        int[] n2 = {6, 7, 8};

        int p = n1.length + n2.length;

        int[] n3 = new int[p];

        for(int i = 0; i < p; i++) {
            if(i < n1.length) {
                n3[i] = n1[i];
            }
            else {
                n3[i] = n2[i - n1.length];
            }
        }

        for(int i : n3) {
            System.out.println(i);
        }
    }
}
