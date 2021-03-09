package test14;

import java.util.Random;
import java.util.Scanner;

public class Test14 {   
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
    
    public static int search(int arr[], int x) { 
        int n = arr.length; 
        for(int i = 0; i < n; i++) { 
            if(arr[i] == x) 
                return i; 
        } 
        return -1; 
    } 
    
    public static void main(String[] args) {
        Test14 ob = new Test14();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số phần tử: ");
        int n = input.nextInt();
        int arr[] = new int[n];
        nhapMang(arr, n);
        System.out.print("Nhập vào giá trị cần tìm kiếm: ");
        int x = input.nextInt();
        ob.bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        ob.printArray(arr);
        int result = ob.search(arr, x);
        if (result == -1)
            System.out.println("Phần tử không tồn tại.");
        else
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
    }
}
