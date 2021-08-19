package Lab3.Bai4_Bai5;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Read_Object  {
   public static void main (String []args) {
       FileInputStream fis = null;
       ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("nhanvien.bin");
            ois = new ObjectInputStream(fis);
            NhanVien[] nv1 = (NhanVien[]) ois.readObject();
            System.out.println("Doc tu file: ");
            for (NhanVien s : nv1) {
                System.out.println(s);
            }
            ois.close(); fis.close();
        } catch (Exception e) {
            System.out.println("Co loi: " + e);
        }
   }
}
