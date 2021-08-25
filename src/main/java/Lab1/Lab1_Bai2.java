
/*  Bai 2
Tao file java va dat ten la Exercise2.java viet chuong trinh cho phep nguoi dung nhap vao cac he so a,b,c
  cua mot phuong trinh bac 2. Tinh toan nghiem cua phuong trinh va in ket qua ra man hinh.
 */
package Lab1;

import java.util.Scanner;

public class Lab1_Bai2 {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a, b va c: ");
        double a= in.nextDouble(), b=in.nextDouble(), c=in.nextDouble();
        double delta;
        if(a!=0){
            delta = b*b - 4*a*c;
            if(delta < 0){System.out.println("Phuong trinh vo nghiem");}
            else if(delta == 0) {System.out.printf("x1= x2= %.3f",-b/(2*a));}
            else {System.out.printf("x1= %.3f va x2= %.3f",(-b+Math.sqrt(delta))/(2*a), (-b-Math.sqrt(delta))/(2*a));}
        }
        if(a==0){ System.out.println("Tro ve phuong trinh bac nhat");
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            }
            if (b != 0) {
                if (c == 0) {
                    System.out.println("x=0");
                } else {
                    System.out.printf("x = %.3f", (-c / b));
                }
            }
        }
    }
}
