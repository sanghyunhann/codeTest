package array;

import java.util.Scanner;

public class Basket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        for (int j=0; j<m; j++) {
            int first = sc.nextInt() -1;
            int second = sc.nextInt()- 1;

            while (first < second) {
                int temp = arr[first];
                arr[first++] = arr[second];
                arr[second--] = temp;
            }
        }
        sc.close();
        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}