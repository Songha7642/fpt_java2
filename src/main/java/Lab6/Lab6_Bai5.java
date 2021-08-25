
/*  Bai 5: 3 diem (thoi gian thuc hien: 50 phut)

Tao file personModel.java, thuc hien cac cong viec sau:
?	Doan code can viet them vao thuc hien cac cong viec:

o	Tao doi tuong personModel<student>
o	Goi phuong thuc addObject de nhap vao 2 sinh vien (student)
o	Goi phuong thuc display de hien thi 2 sinh vien vua nhap.
o
o	Tao doi tuong personModel<employee>
o	Goi phuong thuc addObject de nhap vao 2 nhan vien (employee)
o	Goi phuong thuc display de hien thi 2 nhan vien vua nhap.
o
o	Tao doi tuong personModel<String>
o	Goi phuong thuc addObject de nhap vao ho ten cua 2 nguoi
o	Goi phuong thuc display de hien thi 2 ho ten vua nhap.
 */

package Lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab6_Bai5 <T> {

    public ArrayList<T> li = new ArrayList<T>();


    public void addObject(T object) {
        li.add(object);
    }

    public void display() {
        for (T e:li) {
        System.out.println(e);
        }
    }


    public static void main(String []args){
        int id ;
        String name;
        int age;
        float salary;

        Scanner in = new Scanner(System.in);
        Lab6_Bai5  st1  = new Lab6_Bai5 ();

      System.out.println("Nhap sinh vien");
      for (int i = 0; i <2; i++) {
          System.out.print("\nNhap id: ");
           id = in.nextInt();
           in.nextLine();
          System.out.print("Nhap ten hoc sinh: ");
           name = in.nextLine();
          System.out.print("Nhap tuoi: ");
           age = in.nextInt();
          Lab6_Bai3 st = new Lab6_Bai3(id, name, age);
          st1.addObject(st);
      }

        System.out.println("\nXuat sinh vien");
        st1.display();


      System.out.println("\nNhap nhan vien");
      Lab6_Bai5  st2  = new Lab6_Bai5 ();
        for (int i = 0; i <2; i++) {
            System.out.print("\nNhap id: ");
            id = in.nextInt();
            in.nextLine();
            System.out.print("Nhap ten nhan vien: ");
            name = in.nextLine();
            System.out.print("Nhap luong: ");
            salary = in.nextFloat();
            Lab6_Bai4 st = new Lab6_Bai4(id, name, salary);
            st2.addObject(st);
        }

        System.out.println("\nXuat nhan vien");
        st2.display();

        System.out.println("\nNhap ho ten 2 nguoi");
        Lab6_Bai5  st3  = new Lab6_Bai5 ();
        for (int i = 0; i <2; i++) {
            System.out.print("Nhap ten: ");
            name = in.nextLine();
            st3.addObject(name);
        }

        System.out.println("\nXuat ten 2 nguoi");
        st3.display();


    }
}
