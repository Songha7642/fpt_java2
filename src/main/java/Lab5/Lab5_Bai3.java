
/*  Bai 3:
Tao file exercise3.java, va thuc hien theo yeu cau:

?	Viet phuong thuc public boolean cardNumber(String card) thuc hien cac cong viec:
o	Nhap vao mot xau ky tu la so the sinh vien
o	Tinh tong cac so co trong day so the sinh vien do
o Vi du: xau ky tu la: 0090 8767 3224, tong 0+0+9+0+8+7+6+7+3+2+2+4 = 48
o	Neu tong la so chan thi tra ve true, neu la so le thi tra ve false.

?	Su dung annotation Deprecated cho phuong thuc nay

?	Viet code minh hoat su hoat dong cua phuong thuc cardNumber tren.
 */

package Lab5;

import java.util.Scanner;

public class Lab5_Bai3 {
    @Deprecated
     public static boolean cardNumber (String card) {
        int sum = 0;
        try {
            for (int i = 0; i < card.length(); i++) {
                if (String.valueOf(card.charAt(i)).equals(" ")) {
                    i++;
                }
                sum += (Integer.parseInt(String.valueOf(card.charAt(i))));
            }

        } catch (Exception e) {
            System.out.println("Khong the chuyen thanh so" + e);
        }
        if(sum % 2 == 0) {return true;}
       else {return false;}
    }

    public static void main (String []args) {
        System.out.println("Nhap so the:");
        Scanner in = new Scanner(System.in);
        String card = in.nextLine();
        System.out.println(cardNumber(card));
    }
}
