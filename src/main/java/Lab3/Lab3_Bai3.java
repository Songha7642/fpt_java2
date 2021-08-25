
/*  Bai 3:
Tao file read_from_file.java, viet phuong thuc main, su dung FileReader de doc noi dung file ‘nhanvien.txt’
va in nhung gi da doc duoc tu file ra man hinh.
 */

package Lab3;

import java.io.FileInputStream;
import java.io.IOException;

public class Lab3_Bai3 {
    public static void main(String []args) throws IOException {
        FileInputStream fis = new FileInputStream("file1.dat");
        int c;
        while ( (c = fis.read()) != -1 ) {
            System.out.print( (char) c );
        }
        fis.close();
    }
}
