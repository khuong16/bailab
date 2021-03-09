package test5;

import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void nhapMang(int arr[], int n){
        Random rand = new Random();
        for(int i=0; i<n; i++)
            arr[i]=rand.nextInt(50);    //bạn có thể điền số khác
    }
    
    void sort(int arr[]) {
        int n = arr.length;

        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {

            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    // Xuất mảng
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        Test5 ob = new Test5();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        nhapMang(arr, n);
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
    
}
