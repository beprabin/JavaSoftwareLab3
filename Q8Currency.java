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
public class Q8Currency {
    Q8Currency (){
        Frame f=new Frame("Currency Converter");
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        Label l=new Label("Dollar",Label.LEFT);
        TextField t=new TextField(10);
        Label l1=new Label("Nepalese",Label.LEFT);
        TextField t1=new TextField(10);
        Label l2=new Label("Euro",Label.LEFT);
        TextField t2=new TextField(10);
        
        f.add(l);
        f.add(t);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        
        l.addKeyListener(new KeyListener(){
            int n1;
            
            public void keyTyped(KeyEvent ae){
                n1=Integer.parseInt(t.getText());  
                
            }
            public void keyPressed(KeyEvent ae){
               
            }
            public void keyReleased(KeyEvent ae){
                t1.setText(""+n1*127.62);
                t2.setText(""+n1*0.89);
            }
        });
        
        f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }});
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q8Currency ();
    }
}
