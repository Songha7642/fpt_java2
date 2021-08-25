/*  Bai 1:
Tao file java va dat ten la Exercise1.java viet chuong trinh cho phep nguoi dung nhap vao ban kinh cua mot hinh tron
    sau do tinh dien tich va chu vi cua hinh tron do va in ket qua ra man hinh. Chuong trinh phai dung hang so PI da co san
    cua class Math trong package java.lang.
*/
package Lab1;

import java.util.Scanner;

public class Lab1_Bai1 {
    public static  void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double r = in.nextDouble();
        System.out.println("Chu vi = " + Math.PI*r*2);
        System.out.println("Dien tich = " + Math.PI*r*r);
    }
}
