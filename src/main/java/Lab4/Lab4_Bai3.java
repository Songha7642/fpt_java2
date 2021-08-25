
/*  Bai 3:
Tao file MyThread3.java, va thuc hien theo yeu cau:
?	Thread1: Hien thi cac so tu 1 den 10
?	Thread2: Dua vao cac so duoc hien thi o Thead1 in ra tuong ung la “Chan” hoac “Le”. Su dung method wait()
and notify() va tu khoa synchronized cho cac thread tren.
 */

package Lab4;

public class Lab4_Bai3 {

    public synchronized void run() {
        System.out.println("Thread 1: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(" " + i);
        }
        System.out.println("\nThread 1 Finished ");

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.print("Chan: ");
            for (int i = 0; i < 11; i++) {
                if (i % 2 == 0) {
                    System.out.print(" " + i);
                }
            }
            System.out.println("\nXong chan.");

            System.out.print("\nLe: ");
            for (int i = 0; i < 11; i++) {
                if (i % 2 != 0) {
                    System.out.print(" " + i);
                }
            }

    }

    public synchronized void run2() {
        System.out.println("\nThread 2: ");
        notify();
    }

    public static void main (String []args) throws InterruptedException {
        final Lab4_Bai3 t1 = new Lab4_Bai3();

        Thread th1 = new Thread(() -> {
                t1.run();
        }
        );

        Thread th2 = new Thread(() -> {
                t1.run2();
        });

        th1.start();
        th2.start();
    }
}