package Lab3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

    public class Lab3_Bai2 {
        protected  String manv;
        protected  String hoten;
        protected  int tuoi;
        protected  float luong;


        public Lab3_Bai2(String masv, String hoten, int tuoi, float luong){
            this.manv  = masv;
            this.hoten = hoten;
            this.tuoi  = tuoi;
            this.luong = luong;
        }

        public Lab3_Bai2() {

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

        public String toString() {
            return hoten + "\t" + manv + "\t" + tuoi + "\t" + luong + "\n";
        }


        public static void main (String []args) throws IOException, ClassNotFoundException {
            String text1, text ="";
            Scanner in = new Scanner(System.in);
            ArrayList<Lab3_Bai2> nhanvien  = new ArrayList();
            System.out.print("Enter de nhap. ");

            for (int i = 0; i < 2; i++) {
                Lab3_Bai2 s = new Lab3_Bai2();
                in.nextLine();
                System.out.print("\nNhap ho ten: ");
                s.hoten = in.nextLine();
                System.out.print("Nhap ma nhan vien: ");
                s.manv = in.nextLine();
                System.out.print("Nhap tuoi: ");
                s.tuoi = in.nextInt();
                System.out.print("Nhap luong: ");
                s.luong = in.nextFloat();
                nhanvien.add(s);
            }

            for (int i = 0; i < nhanvien.size(); i++) {
                Lab3_Bai2 s;
                 s = nhanvien.get(i);
                text1 = s.toString();
                text = text.concat(text1);
            }

            FileOutputStream fos = new FileOutputStream("file1.dat");
             byte[] textAsBytes = text.getBytes();
            fos.write(textAsBytes);

        }

    }


