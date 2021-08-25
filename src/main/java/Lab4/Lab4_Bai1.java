
/*  Bai 1
Tao file MyThread1.java thuc thi interface Runnable va thuc hien cac cong viec sau:
?	Trong phuong thuc run() chua mot vong lap in ra 10 so tu nhien dau tien va moi lan in cach nhau 500 milliseconds.
?	Tao 2 object tu class MyThread la Thread1 va Thread2 voi thu tu uu tien tuong ung ma MAX_PRIORITY va MIN_PRIORITY.
?	Goi phuong thuc start() cho ca 2 thread.
 */

package Lab4;

public class Lab4_Bai1 implements Runnable{

        @Override
        public void run() {
            for (int i =0; i < 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Second Thread Error: " + e);
                }
            }
        }

        public static void main (String []args) {
            Lab4_Bai1 t1 = new Lab4_Bai1();
            Thread thread1 = new Thread(t1);
            thread1.setPriority(Thread.MAX_PRIORITY);
            thread1.start();

            Thread thread2 = new Thread(t1);
            thread2.setPriority(Thread.MIN_PRIORITY);
            thread2.start();
        }

    }

