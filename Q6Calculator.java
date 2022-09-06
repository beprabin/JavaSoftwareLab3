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
 * @author PRABI
 */
public class Q6Calculator{
    Q6Calculator(){
    Frame f=new Frame();
    f.setLayout(new GridLayout(2,1));
    
    Panel p1=new Panel();
    
    Label l1=new Label("Number 1");
    TextField t1=new TextField();
    Label l2=new Label("Number 2");
    TextField t2=new TextField();
    Label l3=new Label("Result");
    TextField t3=new TextField();
    p1.setLayout(new GridLayout(3,2));
    p1.add(l1);
    p1.add(t1);
    p1.add(l2);
    p1.add(t2);
    p1.add(l3);
    p1.add(t3);
    
    Panel p2=new Panel();
    Button b1=new Button("+");
    Button b2=new Button("-");
    Button b3=new Button("*");
    Button b4=new Button("/");
    p2.setLayout(new FlowLayout());
    p2.add(b1);
    p2.add(b2);
    p2.add(b3);
    p2.add(b4);
    
    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int sum=n1+n2;
            t3.setText(""+sum);
        }      
    });
    
    b2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int diff=n1-n2;
            t3.setText(""+diff);
        }      
    });
     
    b3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int prod=n1*n2;
            t3.setText(""+prod);
        }      
    });
    
    b4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
            int n1=Integer.parseInt(t1.getText());
            int n2=Integer.parseInt(t2.getText());
            int div=n1/n2;
            t3.setText(""+div);
        }      
    });
    t3.setEditable(false);
    f.add(p1);
    f.add(p2);
    f.setSize(300,400);
    f.setVisible(true);
    f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
    });
    }
    public static void main(String[] args) {
        new Q6Calculator();
    }
}