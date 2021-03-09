package test13;

public class Test13 {
    public static void main(String[] args) {
      int count = 45, num1 = 0, num2 = 1;
        System.out.print("Chuỗi Fibonacci với "+count+" số là: ");
        for (int i = 1; i <= count; ++i)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }
        System.out.println();
        System.out.println("----------------------------");
        System.out.println("Chương trình này được đăng tại Freetuts.net");
    }
    
}
