package Lab8;


import javax.swing.*;

import java.awt.*;

public class Lab8_Bai2 {
    JFrame frm;
    JLabel headerLabel;
    JPanel controlPanel, radioPanel;


       Lab8_Bai2() {

           frm = new JFrame("map");
           frm.setSize(500, 350);

           controlPanel = new JPanel();
           controlPanel.setLayout(null);


           headerLabel = new JLabel("Register information");
           JLabel nameLabel = new JLabel("Name");
           JLabel dateLabel = new JLabel("Date of Birth");
           JLabel emailLabel = new JLabel("Email");
           JLabel sexLabel = new JLabel("Sex");
           JLabel proLabel = new JLabel("Province");
           JLabel operLabel = new JLabel("Operations");

           headerLabel.setFont(new Font("Time New Roman", 1, 13));
           headerLabel.setSize(200,50);
           headerLabel.setLocation(5,0);
           controlPanel.add(headerLabel);

           nameLabel.setFont(new Font("Time New Roman", 1, 13));
           nameLabel.setSize(100,50);
           nameLabel.setLocation(40,30);
           final JTextField nameText = new JTextField(20);

           dateLabel.setFont(new Font("Time New Roman", 1, 13));
           dateLabel.setSize(100,50);
           dateLabel.setLocation(40,60);
           emailLabel.setFont(new Font("Time New Roman", 1, 13));
           emailLabel.setSize(100,50);
           emailLabel.setLocation(40,90);
           sexLabel.setFont(new Font("Time New Roman", 1, 13));
           sexLabel.setSize(100,50);
           sexLabel.setLocation(40,120);
           proLabel.setFont(new Font("Time New Roman", 1, 13));
           proLabel.setSize(100,50);
           proLabel.setLocation(40,150);
           operLabel.setFont(new Font("Time New Roman", 1, 13));
           operLabel.setSize(100,50);
           operLabel.setLocation(5,205);

           controlPanel.add(nameLabel);
           controlPanel.add(nameText);
           controlPanel.add(dateLabel);
           controlPanel.add(emailLabel);
           controlPanel.add(sexLabel);
           controlPanel.add(proLabel);
           controlPanel.add(operLabel);


           JRadioButton maleButton = new JRadioButton("Male");
           JRadioButton femaleButton = new JRadioButton("Female");


           ButtonGroup bgroup = new ButtonGroup();
           bgroup.add(maleButton);
           bgroup.add(femaleButton);

           radioPanel = new JPanel();
           radioPanel.setLayout(new GridLayout(1,2));
           radioPanel.add(maleButton);
           radioPanel.add(femaleButton);


           frm.add(controlPanel);


           frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frm.setLocationRelativeTo(null);
           frm.setVisible(true);

       }

    public static void main(String[] args) {
           Lab8_Bai2 b = new Lab8_Bai2();

    }
}
