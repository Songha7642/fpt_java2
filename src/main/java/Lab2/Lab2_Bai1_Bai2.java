
/*  Bai 1:
Tao project co ten la lab02_tendangnhap va thuc hien cac cong viec sau day:
Tao file vdmang.java va viet chuong trinh nhap vao mot mang so nguyen co 5 phan tu,
  tinh tong cac so nguyen do va in ket qua ra man hinh.


 Bai 2:
Lam tiep tren file vdmang.java va nhap phan tu thu 6. Vi mang chi co 5 phan tu nen khi nhap phan tu thu 6 thi se xuat hien ngoai le.
Viet doan code xu ly ngoai le nay.
 */

package Lab2;

import java.util.Scanner;


public class Lab2_Bai1_Bai2 {
    public static void main (String []args) {
        //bai 1
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum= 0 ;
        System.out.println("Nhap 5 phan tu: ");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i<arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);
        //bai 2
        try {
            System.out.println("Nhap 6 phan tu de test exception:");
            for (int i = 0; i<=arr.length; i++) {
                arr[i] = in.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Ngoai le phat sinh: " + e1);
        }

    }
}
