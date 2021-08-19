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
