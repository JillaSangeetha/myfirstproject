//both swing and awt is there dont confuse

import  javax.swing.*;
import java.awt.*;

 //import java.awt.event.WindowAdapter;
 //import java.awt.event.WindowEvent;
import java.awt.Event.*;
 public class MyAwtWindow {
    public static void main(String args[]){
        JFrame f=new JFrame();
        JLabel l2= new JLabel("first label");
        l2.setBounds(50,100,100,30);
        f.add(l2);
        JLabel l3= new JLabel("secound label");
        l3.setBounds(50,150,100,30);
        f.add(l3);
        JButton b1=new JButton("submit");
        b1.setBounds(50,200,100,30);
        f.add(b1);
        JButton b2=new JButton("cancel");
        b2.setBounds(200,200,100,30);
        f.add(b2);
        JTextField t1=new JTextField();
        t1.setBounds(150,100,150,30);
        f.add(t1);
        JTextField t2=new JTextField();
        t2.setBounds(150,150,150,30);
        f.add(t2);
      /*  f.addWindowListener(new WindowAdapter() {
            public  void WindowClosing(WindowEvent e){
                System.exit(0);
            }
        }); */
        //f.setBackground(Color.BLUE);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
