/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.employeemanagementsystem;

/**
 *
 * @author dev
 */
import java.awt.*;
import javax.swing.*;
import java.lang.Thread;
import java.awt.event.*;

class Front_Page implements ActionListener {
    JFrame f;
    JLabel id,l1;
    JButton b;
    
    Front_Page() {
        f = new JFrame("Front");
        f.setBackground(Color.red);
        f.setLayout(null);
        
        ImageIcon i1 = new ImageIcon("/home/dev/NetBeansProjects/EmployeeManagementSystem/src/main/java/com/mycompany/employeemanagementsystem/icons/front.jpg");
        Image i2 = i1.getImage().getScaledInstance(1200, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,150,1360,530);
        f.add(l1);
        
        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        b.setBounds(500,600,300,70);
        b.addActionListener(this);
        
        id = new JLabel();
        id.setBounds(0,0,1360,750);
        id.setLayout(null);
        
        JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,30,1500,100);
        lid.setFont(new Font("SAN_SERIF",Font.PLAIN,70));
        lid.setForeground(Color.red);
        id.add(lid);
        
        id.add(b);
        f.add(id);
        
        f.getContentPane().setBackground(Color.WHITE);
        
        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);
        
        while(true) {
            lid.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){}
            lid.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==b) {
            f.setVisible(false);
            Login l = new Login();
        }
    }
    public static void main(String[] args) {
        Front_Page f = new Front_Page();
    }
}
