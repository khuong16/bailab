package test19;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Test19 {

    
    public static float[] inputFloatArr(){
        Scanner input = new Scanner(System.in);
        int numberElements;
        // Nhập trong khoảng <= 20 phần tử:
        do {
            System.out.print("Enter number of elements in array (<=20): ");
            numberElements = input.nextInt();
        }
        while (numberElements > 20 || numberElements < 1);
        
        // tạo mảng float
        float arr[] = new float[numberElements];

        // Nhập các phàn tử vào mảng
        for (int i = 0; i <numberElements; i++) {
            System.out.print("Enter number "+(i+1)+": ");
            arr[i] = input.nextFloat();
        }
        return arr;
    }
    
    // Sắp xếp sử dụng bubble sort: 1. đưa vào mảng, 2. trạng thái in, 3. tên file cần đưa vào.
    public static float[] bubbleSort1(float arr[]) throws IOException {
        // tạo biến temp:
        float temp;
        
        // lặp qua tất cả các số.
       for (int i = 0; i < arr.length-1;i++){
           // vòng lặp thứ hai.
           for (int j = 0; j < arr.length-1; j++) {
               // kiểm tra xem số kế tiếp có nhỏ hơn số hiện tại hay không
               // tráo đổi số
               // mục đích : làm nổi bọt (bubble) số lớn nhất.
               if (arr[j] > arr[j+1]) {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
           // nếu mà oke thì sẽ in ra.
           // mỗi lần sắp xếp thì sẽ in ra các bước.
       }
       
       System.out.println(Arrays.toString(arr));
       
       return arr;
    }
    
    // Sắp xếp sử dụng bubble sort: 1. đưa vào mảng, 2. trạng thái in, 3. tên file cần đưa vào.
    public static float[] bubbleSort2(float arr[]) throws IOException {
        // tạo biến temp:
        float temp;
        
        // lặp qua tất cả các số.
       for (int i = 0; i < arr.length-1;i++){
           // vòng lặp thứ hai.
           for (int j = 0; j < arr.length-1; j++) {
               // kiểm tra xem số kế tiếp có nhỏ hơn số hiện tại hay không
               // tráo đổi số
               // mục đích : làm nổi bọt (bubble) số lớn nhất.
               if (arr[j] < arr[j+1]) {
                   temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
           // nếu mà oke thì sẽ in ra.
           // mỗi lần sắp xếp thì sẽ in ra các bước.
       }
       
       System.out.println(Arrays.toString(arr));
       
       return arr;
    }
    
    
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);
        Scanner inputFloat = new Scanner(System.in);
        float[] arrInput = null;
        float[] arrOutput;
        /**
         * A loop is running until exit (0)
         */
        while (true) {
            System.out.println("*********** MENU ***********");
            System.out.println("1. Input");
            System.out.println("2. Bubble Sort 1");
            System.out.println("3. Bubble Sort 2");
            System.out.println("0. Exit");
            System.out.print("----------------------\nYOUR CHOICE: ");

            String choiceInput = input.nextLine();

            /**
             * Switch choice from user
             */
            switch (choiceInput) {
                case "1":
                    arrInput = Test19.inputFloatArr();
                    break;
                case "2":
                    Test19.bubbleSort1(arrInput);
                    break;
                case "3":
                    Test19.bubbleSort2(arrInput);
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Your input is not supported, please try again!");
                    break;
            }

        }
    }

}
