package Array_2D;

public class SpiralPrinting {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        PrintSpiral(arr);

    }

    public static void PrintSpiral(int[][] arr) {

        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int total = (maxr + 1) * (maxc + 1);
        int count = 0;
        while (count != total) {

            for (int i = minc; i <= maxc && count < total; ++i) {
                System.out.print(arr[minr][i] + " ");
                ++count;
            }
            minr++;
            for (int i = minr; i <= maxr && count < total; ++i) {
                System.out.print(arr[i][maxc] + " ");
                ++count;

            }
            maxc--;
            for (int i = maxc; i >= minc && count < total; --i) {
                System.out.print(arr[maxr][i] + " ");
                ++count;
            }
            maxr--;
            for (int i = maxr; i >= minr && count < total; --i) {
                System.out.print(arr[i][minc] + " ");
                ++count;
            }
            minc++;
        }

    }


}
