package LyThuyet;

public class Thap_Ha_Noi {
    public static void Tower(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println(a + "-----" + c);
            return;
        }

        Tower(n - 1, a, c, b);
        Tower(1, a, b, c);
        Tower(n - 1, b, a ,c);
    }

    public static void main(String[] args) {
        Tower(6, 'A', 'B', 'C');
    }

    public static void Print() {
        System.out.println("BlaBla");
    }
}
