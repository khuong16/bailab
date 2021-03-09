package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
//    private ArrayList<Student> students;
//    private Scanner sc; 
//    
//    public Main(){
//        students = new ArrayList<>();
//        sc = new Scanner(System.in);
//    }
//    
//    public void mainMenu(){
//        String ch = "";
//        do {            
//            System.out.println("1-Nhập SV, 2- Xem thông tin, 3-Tìm kiếm theo điểm, 4-Kết thúc chương trình");
//            System.out.println("Mời bạn nhập lựa chọn");
//            ch = sc.nextLine();
//            switch(Integer.parseInt(ch)){
//                case 1:
//                    nhapThongTinSinhVien();
//                    break;
//                case 2:
//                    xemThongTinSinhVien();
//                    break;
//                case 3:
//                    timKiemSinhVien();
//                    break;
//            }
//                    
//        } while (Integer.parseInt(ch)!=4);
//    }
//    
//    public void nhapThongTinSinhVien(){
//        Student sinhVien = new Student();
//        System.out.println("Nhập mã sinh viên: ");
//        sinhVien.setStudentId(sc.nextLine());
//        System.out.println("Nhập họ và tên: ");
//        sinhVien.setStudentName(sc.nextLine());
//        System.out.println("Nhập học kỳ: ");
//        sinhVien.setStudentSemester(sc.nextLine());
//        System.out.println("Nhập tên khóa học: ");
//        sinhVien.setCourseName(sc.nextLine());
//        sc.nextLine();
//        students.add(sinhVien);
//    }
//    public void xemThongTinSinhVien(){
//        for (Student sinhVien : students) {
//            System.out.println("Mã sinh viên: " + sinhVien.getStudentId());
//            System.out.println("Họ và tên: " + sinhVien.getStudentName());
//            System.out.println("Học kỳ:" +sinhVien.getStudentSemester());
//            System.out.println("Khóa học: " + sinhVien.getCourseName());
//        }
//    }
//    
//    public void timKiemSinhVienTheoTen(String name){
//         for (Student sinhVien : students) {
//            if (sinhVien.getStudentName().equalsIgnoreCase(name)) {
//                System.out.println("Mã sinh viên: " + sinhVien.getStudentId());
//                System.out.println("Họ và tên: " + sinhVien.getStudentName());
//                System.out.println("Học kỳ:" +sinhVien.getStudentSemester());
//                System.out.println("Khóa học: " + sinhVien.getCourseName());
//            }
//        }
//    }
//    
//    public void timKiemSinhVien(){
//        System.out.println("Nhập tên cần tìm:");
//        timKiemSinhVienTheoTen(sc.nextLine());
//    }
//    
//    public static void main(String[] args){
//        Main qlsv = new Main();
//        qlsv.mainMenu();
//    }
    public static void main(String[] args) {
    ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Student("1", "Pham Ngoc Hoa", "Spring", "java"));
        ls.add(new Student("2", "Do Quang Hiep", "Summer", ".net"));
        ls.add(new Student("3", "Nguyen Xuan Cuong", "Spring", "c/c++"));
        
        int count = 3;
        //loop until user want to exit program
        while (true) {
            //Show menu option
            StudentManager.menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    StudentManager.createStudent(count, ls);
                    break;
                case 2:
                    StudentManager.findAndSort(ls);
                    break;
                case 3:
                    StudentManager.updateOrDelete(count, ls);
                    break;
                case 4:
                    StudentManager.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }
}
