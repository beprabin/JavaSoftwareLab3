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
        Panel p=new Panel();
        
        f.setSize(400,300);
        
        Label l=new Label("Dollar",Label.LEFT);
        TextField t=new TextField(10);
        Label l1=new Label("Nepalese",Label.LEFT);
        TextField t1=new TextField(10);
        Label l2=new Label("Euro",Label.LEFT);
        TextField t2=new TextField(10);
        
        p.setLayout(new GridLayout(3,2));
        p.setPreferredSize(new Dimension(200,110));
        
        p.add(l);
        p.add(t);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        f.add(p);
        f.setLayout(new FlowLayout());
        t.addKeyListener(new KeyAdapter(){
            int n1;
            
//            public void keyTyped(KeyEvent a){
//                n1=Integer.parseInt(t.getText());  
//              
//            }
//            public void keyPressed(KeyEvent b){
//               
//            }
            public void keyReleased(KeyEvent ae){
                n1=Integer.parseInt(t.getText());
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