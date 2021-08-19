package Lab3.Bai4_Bai5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Write_Object {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("nhanvien.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        NhanVien[] nv = {new NhanVien("Ha", "1",19, 450.3f),
                         new NhanVien("Huy", "2", 20, 847.57f),
                         new NhanVien("Long", "3", 18, 150f)};
        oos.writeObject(nv);
        oos.close();
    }
    }


