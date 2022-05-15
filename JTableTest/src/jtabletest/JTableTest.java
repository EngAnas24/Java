/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtabletest;

import com.sun.org.apache.xalan.internal.lib.NodeInfo;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dell
 */
public class JTableTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
       
          Object[][] rowData = {{"ANAS",22,0543305030,"anas.algahma@gmail.com"}};
        String[] colunmsNames = {"Name","Age", "Number","Gmail"};
        DefaultTableModel model = new DefaultTableModel(rowData, colunmsNames);
       JTable table = new JTable(model);
       f.add(new JScrollPane(table));
       f.pack();
        f.setVisible(true);
    }
    
}
