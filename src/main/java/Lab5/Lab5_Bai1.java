
/*  Bai 1:
Tao file exercise1.java, su dung cac phuong thuc trong class Math,
 thuc hien cac cong viec sau:
?	Nhap vao hai so nguyen a va b
?	Tinh can bac 2 cua so a
?	Tinh a mu b
?	Tinh max giua 2 so a va b
?	Tinh min giua 2 so a va b
 */

package Lab5;

import java.util.Scanner;

public class Lab5_Bai1 {
    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap a va b");
        int a = in.nextInt(), b = in.nextInt();
        System.out.println(Math.sqrt(a));
        System.out.println(Math.pow(a, b));
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));
    }
}
