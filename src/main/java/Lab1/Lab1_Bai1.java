package Lab1;

import java.util.Scanner;

public class Lab1_Bai1 {
    public static  void main (String []args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double r = in.nextDouble();
        System.out.println("Chu vi = " + Math.PI*r*2);
        System.out.println("Dien tich = " + Math.PI*r*r);
    }
}
