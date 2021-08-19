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
