package LyThuyet;

public class Sort {

    public static void BubbleSort(int[] a) {
        int n = a.length;
        for(int i = 0; i < n; i++) {
            boolean isSort = true;
            for(int j = i; j < n - 1; j++) {
                
                if(a[j] > a[j + 1]) {
                    isSort = false;
                    int temp = a[j + 1];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            if(isSort) {
                break;
            }
        }
    }

    public static void SelectionSort(int[] a) {
        int n = a.length;

        for(int i = 0; i < n; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            if(min != i) {
                int tmp = a[i];
                a[i] = a[min];
                a[min] = tmp;
            }
        }
    }

    public static void InsertionSort(int[] a) {
        int n = a.length;
        for(int i = 1; i < n; i++) {
            int key = a[i]; // 2 
            int j = i - 1; // j = 1 
            while(j >= 0 && a[j] > key) {
                a[j + 1] = a[j]; // 3 2 5 // 2 3 5
                j--; // j = 0 // j = -1
            }

            a[j + 1] = key; // a[0] = 2
        }
    }
    public static void main(String[] args) {
        // 3 5 2 7 8 1 2
        // 3 2 5         
        // 
    }
}
 