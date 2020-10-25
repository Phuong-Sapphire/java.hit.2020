package BAI5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

public class CLASSROOM {
    private String classCode;
    private String className;
    private int dateOpen;
    ArrayList<STUDENT> list = new ArrayList<>();
    private int n;
    private PERSON teacher;

    public CLASSROOM() {
    }

    public CLASSROOM(String classCode, String className, int dateOpen, ArrayList<STUDENT> list, int n, PERSON teacher) {
        this.classCode = classCode;
        this.className = className;
        this.dateOpen = dateOpen;
        this.list = list;
        this.n = n;
        this.teacher = teacher;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getDateOpen() {
        return dateOpen;
    }

    public void setDateOpen(int dateOpen) {
        this.dateOpen = dateOpen;
    }

    public ArrayList<STUDENT> getList() {
        return list;
    }

    public void setList(ArrayList<STUDENT> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public PERSON getTeacher() {
        return teacher;
    }

    public void setTeacher(PERSON teacher) {
        this.teacher = teacher;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("class code: ");
        classCode = sc.nextLine();
        System.out.println("class name: ");
        className = sc.nextLine();
        System.out.println("date open: ");
        dateOpen = sc.nextInt();
        System.out.println("figure of student: ");
        n = sc.nextInt();
        for(int i=0; i<n; ++i){
            STUDENT x = new STUDENT();
            x.Input();
            list.add(x);
        }
        teacher = new PERSON();
        System.out.println("enter information about the teacher");
        teacher.Input();
    }
    public void Output() {
        System.out.println("========INFORMATION ABOUT A CLASS========");
        System.out.printf("%-15s%-15s%-15s\n", "class code", "class name", "date open");
        System.out.printf("%-15s%-15s%-15s\n", classCode, className, dateOpen);
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "name", "dob", "hometown", "student code", "major", "course");
        for (int i = 0; i < list.size(); ++i) {
            list.get(i).Output();
        }
        System.out.println("========INFORMATION ABOUT TEACHER========");
        System.out.printf("%-15s%-15s%-15s\n", "name", "dob", "hometown");
        teacher.Output();
    }
    public void filter(){
        int count = 0;
        for (int i = 0; i<list.size(); ++i){
            if (list.get(i).getCourse().compareTo("14") == 0){
                count++;
            }
        }
        System.out.println("\nfigure of student in course 14 : "+count);
    }
    public void increment() {
        for (int i = 0; i < list.size() - 1; ++i) {
            for (int j = i + 1; j < list.size(); ++j) {
                if (list.get(i).getCourse().compareTo(list.get(j).getCourse()) > 0) {
                    STUDENT temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        Output();
    }
}