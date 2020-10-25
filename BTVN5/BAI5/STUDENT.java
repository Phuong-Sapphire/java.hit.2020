package BAI5;

import java.util.Scanner;

public class STUDENT extends PERSON{
    private String studentCode;
    private String major;
    private String course;

    public STUDENT() {
    }

    public STUDENT(String name, String dob, String hometown, String studentCode, String major, String course) {
        super(name, dob, hometown);
        this.studentCode = studentCode;
        this.major = major;
        this.course = course;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("student code: ");
        studentCode = sc.nextLine();
        System.out.println("major: ");
        major = sc.nextLine();
        System.out.println("course: ");
        course = sc.nextLine();
    }
    public void Output(){
        super.Output();
        System.out.printf("%-15s%-15s%-15s\n",studentCode, major, course);

    }
    @Override
    public String toString() {
        return "STUDENT{" + super.toString() +
                "studentCode='" + studentCode + '\'' +
                ", major='" + major + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
