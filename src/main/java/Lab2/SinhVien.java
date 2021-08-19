package Lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SinhVien {
    private int masv;
    private String hoten;
    private int diem;
    private  String xeploai;
    private static final int DIEM = 0;
    private static final String XEPLOAI = "CHUA XEP LOAI";
    private static final int MASV = 0;
    private static final String HOTEN = "CHUA CO TEN";

    public SinhVien (int masv, String hoten, int diem, String xeploai) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.xeploai = xeploai;
    }

    public SinhVien() {
        this(MASV, HOTEN, DIEM, XEPLOAI);
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getXeploai() {
        return xeploai;
    }

    public void setXeploai(String xeploai) {
        this.xeploai = xeploai;
    }

    public void setXeploai() {
        if(diem >= 8) {
            xeploai = "Gioi";
        }
        else if(diem >= 7) {
            xeploai = "Kha";
        }
        else if(diem >= 5) {
            xeploai = "Trung binh";
        }
        else {
            xeploai = "Kem";
        }
    }

    public void input() {
            Scanner in = new Scanner(System.in);
            System.out.print("Nhap ho ten: ");
            hoten = in.nextLine();
            try{
            System.out.print("Nhap ma sinh vien: ");
            masv = in.nextInt();
            System.out.print("Nhap diem: ");
            diem = in.nextInt();
            this.setDiem(diem);
        } catch (InputMismatchException e) {
            System.out.println("Ban phai nhap du lieu so. " + e);
        }
    }
    public static void main (String []args){
        SinhVien s = new SinhVien();
        System.out.println("Sinh vien: " + s);
        s.input();
        s.setXeploai();
        System.out.println("Sau khi nhap: ");
        System.out.println(s);
    }
}
