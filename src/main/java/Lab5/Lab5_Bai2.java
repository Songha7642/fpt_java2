
/*  Bai 2:
Tao file exercise2.java, va thuc hien theo yeu cau:
?	Nhap vao 2 xau ky tu
?	Chuyen doi 2 xau do thanh so
?	Su dung try… catch de xu ly ngoai le khi khong the chuyen doi thanh so
?	Tinh tong 2 so va in ket qua ra man hinh.
 */

package Lab5;

import java.util.Scanner;

public class Lab5_Bai2 {
    public static void main (String []args) {
        int i1 = 0, i2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap xau a va xau b");
        String a = in.next();
        String b = in.next();
        try {
             i1 = Integer.parseInt(a);
             i2 = Integer.parseInt(b);
        } catch (Exception e) {
            System.out.println("Khong the chuyen thanh so" + e);
        }
        System.out.println("Sum= "+ (i1+i2));
    }
}
