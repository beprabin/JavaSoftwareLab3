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
public class Q7Factorial {
    Q7Factorial(){
        Frame f=new Frame("Factorial");
        f.setSize(500,300);
        f.setLayout(new FlowLayout());
        Label l=new Label("Number",Label.LEFT);
        TextField t=new TextField(10);
        Button b=new Button("Calculate");
        Label l1=new Label("Factorial",Label.LEFT);
        TextField t1=new TextField(10);
        t1.setEditable(false);
        
        f.add(l);
        f.add(t);
        f.add(b);
        f.add(l1);
        f.add(t1);
        
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                int n1=Integer.parseInt(t.getText());
                t1.setText(""+(n1*n1-1));
            }
        });
        
        f.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }});
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new Q7Factorial();
    }
}
