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
 * @author Prabin
 */
public class Q10MouseEvent extends Frame implements MouseListener{
    Frame f;
    Label l1,l2,l3;
    Panel p1,p2,p3;
    Q10MouseEvent(){
        f=new Frame("Java MouseEvent Example");
                      
        l1= new Label("MouseListener");
        l2= new Label("Welcome to MouseEvent Demo");
        l3= new Label();

        p1= new Panel(new FlowLayout());
        p2= new Panel(new FlowLayout());
        p3= new Panel();
        l2.setBackground(Color.MAGENTA);
        
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent ae){
                System.exit(0);
            }
        });
        
        p1.add(l1);
        p2.add(l2);
 
        p3.addMouseListener(this);
        
        f.add(p1);
        f.add(p2);
        f.add(p3);
        
        f.setSize(500,500);
        f.setResizable(false);
        
        f.setLayout(new GridLayout(3,1));
        
        f.setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        p3.add(l3);
        l3.setAlignment(Label.CENTER);
        l3.setText("Mouse Clicked: (" + e.getX() + ", " + e.getY() + ")");
        l3.setSize(500,20);
    }
    public void mousePressed(MouseEvent e){
        p3.add(l3);
        l3.setAlignment(Label.CENTER);
        l3.setText("Mouse Pressed: (" + e.getX() + ", " + e.getY() + ")");
        l3.setSize(500,20);
    }
    public void mouseReleased(MouseEvent e) {
        p3.add(l3);
        l3.setAlignment(Label.CENTER);
        l3.setText("Mouse Released: (" + e.getX() + ", " + e.getY() + ")");
        l3.setSize(500,20);
    }

    public void mouseEntered(MouseEvent e) {
        p3.add(l3);
        l3.setAlignment(Label.CENTER);
        l3.setText("Mouse Entered: (" + e.getX() + ", " + e.getY() + ")");
        l3.setSize(500,20);
    }

    public void mouseExited(MouseEvent e) {
        p3.add(l3);
        l3.setAlignment(Label.CENTER);
        l3.setText("Mouse Exited: (" + e.getX() + ", " + e.getY() + ")");
        l3.setSize(500,20);
    }
    public static void main(String[] args){
        new Q10MouseEvent();
    }
    
}