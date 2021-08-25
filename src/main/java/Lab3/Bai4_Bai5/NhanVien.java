
/*  Bai 4:
Tao file write_object.java, tao mang 3 nhanvien, nhap thong tin cac nhan vien, su dung
ObjectOutputStream de ghi mang nhan vien nay vao file ‘nhanvien.bin’.

Bai 5:
Tao file read_object.java, tao mang 3 nhanvien, su dung ObjectInputStream de doc du lieu tu file ‘nhanvien.bin’ va in mang nhan vien ra man hinh.

 */

package Lab3.Bai4_Bai5;

import java.io.Serializable;


public class NhanVien implements Serializable {
    protected String manv;
    protected String hoten;
    protected int tuoi;
    protected float luong;


    public NhanVien(String hoten, String masv, int tuoi, float luong) {
        this.manv  = masv;
        this.hoten = hoten;
        this.tuoi  = tuoi;
        this.luong = luong;
    }

    public String toString() {
        return hoten + "\t" + manv + "\t" + tuoi + "\t" + luong + "\n";
    }

}
