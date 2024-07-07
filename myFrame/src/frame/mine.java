/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



/**
 *
 * @author User
 */
public class mine extends JFrame{

    public mine(){
        this.setSize(800,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //this.getContentPane().setBackground(Color.red);
        this.setLayout(null);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout());
        panel1.setLayout(new GridLayout(3,3,10,10));
        Font fo = new Font("Comic Sans MS", Font.BOLD, 20);
         Font f = new Font("Comic Sans MS", Font.BOLD, 16);
         Font fon = new Font("Ebrima", Font.PLAIN, 16);
        
        JLabel lable1 = new JLabel("My fist Frame");
        lable1.setBounds(300,0, 250, 50);
        lable1.setFont(fo);
        lable1.setForeground(Color.red);
        this.add(lable1);
        
         JLabel lable2 = new JLabel("Enter your name :");
         lable2.setFont(f);
         JTextField text1 = new JTextField();
         text1.setFont(fon);
         
          JLabel lable3 = new JLabel("Enter your Surname :");
         lable3.setFont(f);
         JTextField text2 = new JTextField();
         text2.setFont(fon);
        
          JLabel lable4 = new JLabel("Enter your email :");
         lable4.setFont(f);
         JTextField text3 = new JTextField();
         text3.setFont(fon);
         
         JButton save = new JButton("Save");
         save.setForeground(Color.GREEN);
         JButton next = new JButton("Next");
         next.setForeground(Color.red);
         
         panel2.setBounds(300, 200, 200, 50);
         panel2.add(save);
         panel2.add(next);
         this.add(panel2);
         
         
         panel1.setBounds(250, 50, 350, 100);
         panel1.add(lable2);
         panel1.add(text1);
          panel1.add(lable3);
         panel1.add(text2);
          panel1.add(lable4);
         panel1.add(text3);
         this.add(panel1);
        
        this.setVisible(true);
        
    
}

}
