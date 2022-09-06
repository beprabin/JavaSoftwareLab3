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
 * @author PRABIN
 */
public class Q4Display {
    Q4Display(){
        Frame f=new Frame();
        f.setSize(400,100);
        TextField t= new TextField("Hello",10);
        Button b=new Button("Submit");
        Label l= new Label();
        
        t.setEditable(false);
        f.setLayout(new FlowLayout());
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                l.setSize(50,20);
                l.setText(""+t.getText());
            }
        });
        f.add(t);
        f.add(b);
        f.add(l);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
                 public void windowClosing(WindowEvent windowEvent) {
                 System.exit(0);
             }});
    
    }
    public static void main(String[] args) {
        new Q4Display();
    }
}