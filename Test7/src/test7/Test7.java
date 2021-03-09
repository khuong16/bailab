package test7;

import java.util.Random;
import java.util.Scanner;

public class Test7 {

    public static void nhapMang(int arr[], int n){
        Random rand = new Random();
        for(int i=0; i<n; i++)
            arr[i]=rand.nextInt(50);    //bạn có thể điền số khác
    }
    
    // Phương thức sắp xếp chèn
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr [0 ... i - 1], lớn hơn key
            // đến một vị trí trước vị trí hiện tại của chúng
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // In các phần tử của mảng
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        nhapMang(arr, n);
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        Test7 ob = new Test7();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
    
}
