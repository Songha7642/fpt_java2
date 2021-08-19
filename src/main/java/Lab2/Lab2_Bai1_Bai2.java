package Lab2;

import java.util.Scanner;


public class Lab2_Bai1_Bai2 {
    public static void main (String []args) {
        //bai 1
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum= 0 ;
        System.out.println("Nhap 5 phan tu: ");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i<arr.length; i++) {
            sum+= arr[i];
        }
        System.out.println(sum);
        //bai 2
        try {
            System.out.println("Nhap 6 phan tu de test exception:");
            for (int i = 0; i<=arr.length; i++) {
                arr[i] = in.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("Ngoai le phat sinh: " + e1);
        }

    }
}
