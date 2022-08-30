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
 * @author USER
 */
public class Q5Swap {
    Q5Swap(){
        Frame f=new Frame("Swap");
        f.setSize(400,300);
        f.setLayout(new GridLayout(3,2));
        Label l1=new Label("Number 1");
        Label l2=new Label("Number 1");
        TextField t1=new TextField(10);
        TextField t2=new TextField(10);
        TextField temp=new TextField(10);
        Button b=new Button("Swap");
        
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                temp.setText(""+t2.getText());
                t2.setText(""+t1.getText());
                t1.setText(""+temp.getText());
            }
        });
        
        f.addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent we){
                 System.exit(0);
             }
         });
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q5Swap();
    }
}
