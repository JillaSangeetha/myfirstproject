
import javax.swing.*;
public class LabelExample {
    public static void main(String ar[]){
       JFrame f=new JFrame("Lable Example");
        JLabel l1,l2;
        l1=new JLabel("name");
        l1.setBounds(50,50,100,30);
        l2=new JLabel("fathername");
        l2.setBounds(50,100,100,30);
        f.add(l1);
        f.add(l2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}

