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
public class Q3Color {
    Q3Color(){
        Frame f=new Frame("Choose a Color");
        Panel p=new Panel();
        f.add(p);
        f.setSize(400,400);
        p.setPreferredSize(new Dimension(400,400));
        f.setLayout(new FlowLayout());
        Button b1=new Button("Red");
        Button b2=new Button("Green");
        Button b3=new Button("Blue");
        Button b4=new Button("Close");
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        f.setVisible(true);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                p.setBackground(Color.red);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                p.setBackground(Color.green);
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                p.setBackground(Color.blue);
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Q3Color();
    }
}
