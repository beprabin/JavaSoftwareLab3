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
public class Q1CountDown {
    Q1CountDown(){
        Frame f=new Frame("AWT Counter");
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        Label l=new Label("Enter an Integer",Label.LEFT);
        TextField t=new TextField("10",20);
        t.setEditable(false);
        Button b=new Button("Count Down");
        f.add(l);
        f.add(t);
        f.add(b);
        f.setVisible(true);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1=Integer.parseInt(t.getText());
                int res=n1-1;
                t.setText(""+res);
            }
        });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }
    public static void main(String[] args) {
        new Q1CountDown();
    }
}
