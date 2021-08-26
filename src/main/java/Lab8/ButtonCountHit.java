
/* Bai 1:
 Tao file java va dat ten la Exercise1.java va viet them ma de hoan thanh viec dem so lan kich chuot.
 */

package Lab8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

    public class ButtonCountHit {
        JFrame frm;
        JButton btnClick;
        JLabel lblMessage;
        private int count;

        ButtonCountHit(){
            frm = new JFrame("Count Button Hit");
            lblMessage = new JLabel("Click to the button");

            lblMessage.setFont(new Font("Arial",1,25));

            btnClick = new JButton(" Click here ");

            btnClick.setFont(new Font("Arial",1,25));

            count = 0;

            frm.add(btnClick,BorderLayout.CENTER);
            frm.add(lblMessage, BorderLayout.SOUTH);

            btnClick.addActionListener(new actionButton());

            frm.setSize(300,200);
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frm.setLocationRelativeTo(null);
            frm.setVisible(true);
        }

        class actionButton implements ActionListener{
            public void actionPerformed(ActionEvent e) {
              count++;
                System.out.println(count);
            }

        }
        public static void main(String[] args) { ButtonCountHit b = new ButtonCountHit();
        }
    }

