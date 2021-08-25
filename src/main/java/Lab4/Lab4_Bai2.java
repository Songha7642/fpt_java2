
/*  Bai 2:
Tao file MyThread2.java, va thuc hien theo yeu cau:
?	Tao thread 1 va thread 2
?	Thread 1 se in ra cac so chan nam trong 1 den 10
?	Thread 2 se in ra cac so le nam trong 1 den 10
?	Viet doan code sao cho chuong trinh se chay xong thread 1 thi chay tiep sang thread 2.

 */

package Lab4;

public class Lab4_Bai2 {
        public static void main (String []args) throws InterruptedException {
            Thread t1 = new Thread(() -> {
                System.out.println("Thread 1: ");
                for (int i = 0; i < 10; i++) {
                    if (i % 2 == 0) {
                        System.out.print(" " + i);
                    }
                }
                System.out.println("\nThread 1 Finished ");
            });
            Thread t2 = new Thread(() -> {
                System.out.println("\nThread 2: ");
                for (int i = 0; i < 10; i++) {
                    if (i % 2 != 0) {
                        System.out.print(" " + i);
                    }
                }
            });
            t1.start();
            t1.join();
            t2.start();
        }
    }


