package test10;

import java.util.Random;
import java.util.Scanner;

public class Test10 {

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
    
    // Trả về chỉ mục của x nếu nó có trong arr[l..r]
    // ngược lại trả về -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // Nếu phần tử có ở chính giữa
            if (arr[mid] == x)
                return mid;

            // Nếu phần tử nhỏ hơn giữa, thì nó chỉ có thể
            // hiện diện trong mảng con bên trái
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Ngược lại, phần tử chỉ có thể có mặt
            // trong mảng con bên phải
            return binarySearch(arr, mid + 1, r, x);
        }

        // Nếu phầnt tử không có trong mảng
        return -1;
    }
    
    public static void main(String[] args) {
        Test10 ob = new Test10();
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
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Phần tử không tồn tại.");
        else
            System.out.println("Phần tử được tìm thấy tại vị trí: " + result);
    }
    
}
