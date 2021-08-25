
/*  Bai 1:
Tao file exercise1.java, su dung ArrayList (import java.util), thuc hien cac cong viec sau:
?	Them vao ArrayList 1 so nguyen
?	Them vao ArrayList 1 so thuc
?	Them vao ArrayList  1 gia tri boolean
?	Them vao ArrayList 1 xau ky tu
?	In ra man hinh 4 gia tri tren tu ArrayList

 */

package Lab6;

import java.util.ArrayList;

public class Lab6_Bai1 {
    public static void main (String []args) {
        ArrayList list = new ArrayList();
        list.add(10);
        list.add(15.5f);
        list.add(true);
        list.add("Song Ha");

        int a = (Integer)list.get(0);
        float b = (Float)list.get(1);
        boolean c = (Boolean)list.get(2);
        String d = (String)list.get(3);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
