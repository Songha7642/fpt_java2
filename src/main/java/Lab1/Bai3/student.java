package Lab1.Bai3;

import java.util.Scanner;

public class student extends person{
    private int mark;
    private String grade;


    public void setMark(int mark) {
        this.mark = mark;
    }
    public int getMark() {
        return mark;
    }

    public String getGrade() {
        return grade;
    }

    public void toCalGrade() {
        if (mark >=8) {grade = "distinction";}
        else if (mark >= 7) {grade = "credit";}
        else if (mark >= 5) {grade = "pass";}
        else if (mark >= 0) {grade = "fail";}
    }

    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        super.input();
        System.out.println("Nhap diem: ");
        setMark(mark = in.nextInt());
    }

    @Override
    public void display() {;
        super.display();
        System.out.println("Mark: " + getMark() + "\tGrade: " + getGrade() );
    }

    public static void main (String []args) {
        student s = new student();
        s.input();
        s.toCalGrade();
        s.display();

    }
}
