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
public class Q9KeyEvent {
    Q9KeyEvent(){
        Frame f=new Frame("Key Event");
        f.setSize(400,400);
        f.setLayout(new FlowLayout());
        Label l=new Label("Enter Text",Label.LEFT);
        TextField t=new TextField(10);
        Label l1=new Label();
        
        f.add(l);
        f.add(t);
        f.add(l1);
        
        t.addKeyListener(new KeyListener(){
            public void keyTyped(KeyEvent ae){
               
            }
            public void keyPressed(KeyEvent ae){
               // l1.setText(""+t.getText());
            }
            public void keyReleased(KeyEvent ae){
                //l1.getText();
                l1.setSize(200,20);
                l1.setText(""+t.getText());
            }
        });
        
        f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }});
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q9KeyEvent();
    }
}