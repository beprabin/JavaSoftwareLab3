/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab3;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author nccs
 */
public class Q2CountUpDown {
    Q2CountUpDown(){
        Frame f=new Frame("AWT Counter");
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        Label l=new Label("Enter an Integer",Label.LEFT);
        TextField t=new TextField("10",10);
        t.setEditable(false);
        Button b1=new Button("Up");
        Button b2=new Button("Down");
        Button b3=new Button("Reset");
        f.add(l);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setVisible(true);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1=Integer.parseInt(t.getText());
                int res=n1+1;
                t.setText(""+res);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1=Integer.parseInt(t.getText());
                int res=n1-1;
                t.setText(""+res);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1=Integer.parseInt(t.getText());
                int res=n1-1;
                t.setText("0");
            }
        });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }
    public static void main(String[] args) {
        new Q2CountUpDown();
    }
}
