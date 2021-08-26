
/* Bai 3
 Viet cac doan ma de xu ly cong viec o Bai 2 sao cho (Goi y: xem bai demo/demo.java trong project di kem):
-	Click chuot vao nut ‘Register’ thi cac thong tin nguoi dung nhap se duoc ghi vao file ‘dulieu.txt’ neu du lieu nguoi dung nhap vao day du va hop le.
-	Neu nguoi dung khong nhap du du lieu hoac nhap sai thi dung JOptionPane.showMessageDialog()
de thong bao cho nguoi dung biet la “Phai nhap day du du lieu va hop le”.
-	Click vao nut ‘Reset’ thi cac thong tin nguoi dung nhap vao se bi xoa bo.
 */

package Lab8;

import javax.swing.*;

public class Lab8_Bai3 {
    JFrame frm;
    JPanel controlPanel, radioPanel;

    Lab8_Bai3() {
        frm = new JFrame("map");
        frm.setSize(500, 290);

        controlPanel = new JPanel();
        controlPanel.setLayout(null);

        JLabel headerLabel = new JLabel("Register information");
        headerLabel.setLocation(15,-30);
        headerLabel.setSize(200,100);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setLocation(60,-5);
        nameLabel.setSize(100,90);

        JLabel dateLabel = new JLabel("Date of birth");
        dateLabel.setLocation(60,20);
        dateLabel.setSize(100,90);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setLocation(60,45);
        emailLabel.setSize(100,90);

        JLabel sexLabel = new JLabel("Sex");
        sexLabel.setLocation(60,70);
        sexLabel.setSize(100,90);

        JLabel proLabel = new JLabel("Province");
        proLabel.setLocation(60,95);
        proLabel.setSize(120,100);

        JLabel operLabel = new JLabel("Operation");
        operLabel.setLocation(15,137);
        operLabel.setSize(100,90);

        // Make TextField

        JTextField nameText = new JTextField(25);
        nameText.setLocation(180,32);
        nameText.setSize(250,20);

        JTextField dateText = new JTextField(25);
        dateText.setLocation(180,57);
        dateText.setSize(250,20);

        JTextField emailText = new JTextField(25);
        emailText.setLocation(180,82);
        emailText.setSize(250,20);

        // Make Radio

        JRadioButton maleLabel = new JRadioButton("Male");
        maleLabel.setLocation(180,102);
        maleLabel.setSize(70,30);
        JRadioButton femaleLabel = new JRadioButton("Female");
        femaleLabel.setLocation(310,102);
        femaleLabel.setSize(70,30);

        // Make ComboBox

        String[] province = {"Ha Noi", "TP.Ho Chi Minh", "Ca Mau", "Can Tho", "Dong Thap",
                "Kien Giang", "Vung Tau", "Bac Giang", "Thanh Hoa", "Ha Nam", "Ha Tinh", "Bac Ninh", "Hue",
                "Da Nang", "Binh ?inh"};
        JComboBox choice = new JComboBox(province);
        choice.setLocation(307,134);
        choice.setSize(117,22);

        // Make Button

        JButton btn1 = new JButton("Register");
        btn1.setLocation(105,200);
        btn1.setSize(120,22);

        JButton btn2 = new JButton("Reset");
        btn2.setLocation(230,200);
        btn2.setSize(88,22);


        controlPanel.add(headerLabel);
        controlPanel.add(nameLabel);
        controlPanel.add(dateLabel);
        controlPanel.add(emailLabel);
        controlPanel.add(sexLabel);
        controlPanel.add(proLabel);
        controlPanel.add(operLabel);
        controlPanel.add(nameText);
        controlPanel.add(dateText);
        controlPanel.add(emailText);
        controlPanel.add(maleLabel);
        controlPanel.add(femaleLabel);
        controlPanel.add(choice);
        controlPanel.add(btn1);
        controlPanel.add(btn2);

        frm.add(controlPanel);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);

    }

    public static void main(String[] args) {
        Lab8_Bai3 b = new Lab8_Bai3();

    }
}
