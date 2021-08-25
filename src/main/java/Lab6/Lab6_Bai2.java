
/* Bai 2:
Tao file exercise2.java, su dung ArrayList (import java.util), thuc hien cac cong viec sau:
?	Generic ArrayList la kieu Integer (ArrayList<Integer> myarrr = new ArrayList<Integer>();)
?	Su dung vong lap de nhap cac so tu 1 den 10 vao mang myarrr tren
?	Su dung vong lap de hien thi cac so tu 1 den 10 tu mang myarrr.
 */

package Lab6;

import java.util.ArrayList;

public class Lab6_Bai2 {
    public static void main (String []args) {
        ArrayList <Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            System.out.print(x + " ");
        }

    }
}
