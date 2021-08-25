
/*  Bai 3
1.	Tao interface co ten personExample co 2 phuong thuc:
a.	public void input();
b.	public void display();

2.	Tao class person thuc thi interface tren va co them cac thuoc tinh va phuong thuc sau:
•	protected String id
•	protected String name
•	protected int age
Viet cac constructor, setter, getter

3.	Tao class student ke thua tu class person va co them cac thuoc tinh va phuong thuc sau:
•	private int mark,
•	private String grade

a.	Viet cac getter cho mark, grade
b.	Viet setter cho mark
c.	Viet phuong thuc tinh grade nhu sau:

public void calGrade():
neu mark > = 8 thi grade = “distinction” neu mark >=7 thi grade = “credit”
neu mark >=5 thi grade = “pass” neu mark >=0 thi grade = “fail”
Viet lai cac phuong thuc input() va display() va 2 constructor

4.	Viet phuong thuc main trong class student va thuc hien cac cong viec:
a.	Nhap vao 1 student tu ban phim
b.	In du lieu da nhap ra man hinh

 */


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
    public void display() {
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
