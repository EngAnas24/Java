/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main1;

/**
 *
 * @author dell
 */

        import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JLabel;
import javax.swing.JFrame;
 
public class Main1 {
 
    public static void main(String[] args) {
 
        JFrame frame = new JFrame("MouseMotionListener demo");  // أي قمنا بإنشاء نافذة مع وضع عنوان لها JFrame هنا أنشأنا كائن من الكلاس
        JLabel mousePosition = new JLabel("Mouse Position:");   // mousePosition إسمه Label هنا أنشأنا
 
        frame.add(mousePosition);                               // frame في الـ mousePosition هنا أضفنا الكائن
 
        // هنا نضع الأوامر التي نريد تنفيذها عند تفاعل المستخدم مع النافذة بواسطة الفأرة
        frame.addMouseMotionListener(new MouseMotionListener() {
 
            @Override
            public void mouseDragged(MouseEvent e) { }
 
            @Override
            public void mouseMoved(MouseEvent e) {
                mousePosition.setText(" Mouse Position: ("+e.getX()+", "+e.getY() +")");
            }
 
        });
 
        frame.setSize(300, 250);                                // هنا قمنا بتحديد حجم النافذة. عرضها 300 و طولها 250
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // هنا جعلنا زر الخروج من النافذة يغلق البرنامج
        frame.setLayout(new FlowLayout());                      // لترتيب الأشياء التي أضفناها فيها FlowLayout هنا جعلنا النافذة تستخدم الـ
        frame.setVisible(true);                                 // هنا جعلنا النافذة مرئية
 
    }
 
}
    
