/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listtest;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author dell
 */
public class ListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame();
        f.setLayout(new  FlowLayout());
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JComboBox cb1 = new JComboBox();
        cb1.addItem("Anas");
        cb1.addItem("Hanan");
        cb1.addItem("Kareem");
        cb1.addItem("Rooh");
        f.add(cb1);
        
       String [] names = {"HANAN","NANOOOOO","NAZOO"};
       
        JComboBox cb2 = new JComboBox(names);
        f.add(cb2);
        
        JList NickNames = new JList(names);
        f.add(NickNames);
        f.setVisible(true);
    }
    
}
