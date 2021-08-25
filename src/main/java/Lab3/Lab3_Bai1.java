
/*  Bai 1:

Tao file nhanvien.java va thuc hien cac cong viec:
Tao class nhanvien co cac thuoc tinh: manv	String
hoten	String tuoi	int luong	float

Viet cac setter, getter, constructor, toString

Viet phuong thuc main de nhap vao cac thong tin cho 1 nhan vien tu ban phim va in cac thong tin cua nhan vien nay ra man hinh.

 */

package Lab3;

import java.util.Scanner;

public class Lab3_Bai1 {
    protected static String manv;
    protected static String hoten;
    protected static int tuoi;
    protected static float luong;

    public Lab3_Bai1(String masv, String hoten, int tuoi, float luong){
        this.manv  = masv;
        this.hoten = hoten;
        this.tuoi  = tuoi;
        this.luong = luong;
    }

    public Lab3_Bai1() {

    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getManv() {
        return manv;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getHoten() {
        return hoten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public float getLuong() {
        return luong;
    }


    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = in.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        manv = in.nextLine();
        System.out.println("Nhap tuoi: ");
        tuoi = in.nextInt();
        System.out.println("Nhap luong: ");
        luong = in.nextFloat();

        in.nextLine();
        System.out.println(manv + "\t" + hoten + "\t" + tuoi + "\t" + luong + "\n");

    }

}
