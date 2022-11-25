package Arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AscendingToDescendingArraySorting {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = {11, 23, 56, 97, 32, 40, 72, 65, 88, 56, 32, 79, 72};
        mergeSort(arr, 0, arr.length - 1);
        System.out.print("OUTPUT 1 : ");
        System.out.println(Arrays.toString(arr));
        System.out.print("OUTPUT 2 : ");
        RemoveDuplicates(arr);
    }

    //    call mergeSort method for sorting and pass array as first argument, 0 as second and size of array - 1
//      as third one
    public static void merge(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1];
        int[] M = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = arr[q + 1 + j];

        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {


            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    // Method to remove Duplicates from sorted Array
    public static void RemoveDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] != arr[i - 1])
                list.add(arr[i]);
        }
        int[] arr2 = new int[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            arr2[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr2));
    }


}

