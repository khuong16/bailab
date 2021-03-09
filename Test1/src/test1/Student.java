package test1;

import java.io.Serializable;

public class Student implements Serializable{
//    private String studentId;
//    private String studentName;
//    private String studentSemester;
//    private String courseName;
//
//    public Student(String studentId, String studentName, String studentSemester, String courseName) {
//        this.studentId = studentId;
//        this.studentName = studentName;
//        this.studentSemester = studentSemester;
//        this.courseName = courseName;
//    }
//    
//    public Student(){
//        
//    }
//
//    public String getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(String studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getStudentName() {
//        return studentName;
//    }
//
//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
//
//    public String getStudentSemester() {
//        return studentSemester;
//    }
//
//    public void setStudentSemester(String studentSemester) {
//        this.studentSemester = studentSemester;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
     private String id;
    private String studentName;
    private String semester;
    private String courseName;

    public Student() {
    }

    public Student(String id, String studentName, String semester, String courseName) {
        this.id = id;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int compareTo(Student t) {
        return t.studentName.compareTo(this.studentName);
    }

    public void print() {
        System.out.printf("%-15s%-15s%-15s\n", studentName, semester, courseName);
    }
}

class Report {

    private String studentName;
    private String courseName;
    private int totalCourse;

    public Report() {
    }

    public Report(String studentName, String courseName, int totalCourse) {
        this.studentName = studentName;
        this.courseName = courseName;
        this.totalCourse = totalCourse;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(int totalCourse) {
        this.totalCourse = totalCourse;
    }
}
