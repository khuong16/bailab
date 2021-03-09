package test4;

import java.util.Random;
import java.util.Scanner;

public class Test4 {

    public static void nhapMang(int arr[], int n){
        Random rand = new Random();
        for(int i=0; i<n; i++)
            arr[i]=rand.nextInt(50);    //bạn có thể điền số khác
    }
    // Hàm sắp xếp nổi bọt
    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] và arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
        }
    }
    
    // In các phần tử của arr
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Test4 ob = new Test4();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        nhapMang(arr, n);
        System.out.println("Mảng ban đầu:");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
    }
    
}
