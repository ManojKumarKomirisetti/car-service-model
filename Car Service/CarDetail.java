package CAR;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
public class CarDetail extends JFrame
{
    
   public void Manoj()
    {
        JFrame jf2= new JFrame("RESULT"); 
        JLabel lb1,lb2,lb3,lb4,lb5;
lb1=new JLabel("**RESULT**");
lb2=new JLabel("*Immediate Service Needed To secore Engine....");
lb3=new JLabel("*Vechile Has Consumed Fuel > 100 Litres.");
lb4=new JLabel(" *Engine Oil has not Changed than required");
lb5=new JLabel(" Engine Ran Over 650km,look Over Tyres.");
jf2.add(lb1);
jf2.add(lb2);jf2.add(lb3);jf2.add(lb4);jf2.add(lb5);
lb1.setBounds(680,20,200,180);
lb2.setBounds(150,60,700,300);
lb3.setBounds(150,100,700,300);
lb4.setBounds(150,140,700,300);
lb5.setBounds(150,180,700,300);
        jf2.setSize(2500,2500);
jf2.setLayout(null);
jf2.setVisible(true);
    }


    public void Manoj1()
    {
 JFrame jf2=new JFrame("RESULT");
 JLabel lb1,lb2,lb3,lb4,lb5;
lb1=new JLabel("**RESULT**");
lb2=new JLabel("* Service Needed To Clean Engine....");
lb3=new JLabel("*Vechile Has Consumed Fuel > 100 Litres.");
lb4=new JLabel(" *Engine Oil has  Changed .");
lb5=new JLabel(" Engine Ran Over 650km, look over Tyres.");
jf2.add(lb1);
jf2.add(lb2);jf2.add(lb3);jf2.add(lb4);jf2.add(lb5);
lb1.setBounds(680,20,200,180);
lb2.setBounds(150,60,700,300);
lb3.setBounds(150,100,700,300);
lb4.setBounds(150,140,700,300);
lb5.setBounds(150,180,700,300);
jf2.setSize(2500,2500);
jf2.setLayout(null);
jf2.setVisible(true);
    }

    public void Manoj2()
    {
        JFrame jf2=new JFrame("RESULT");
          JLabel lb1,lb2,lb3,lb4,lb5;
lb1=new JLabel("**RESULT**");
lb2=new JLabel("*Good To Go ");
lb3=new JLabel("*Vechile Has Consumed Fuel < 100 Litres.");
lb4=new JLabel(" *Change Oil Time to Time required");
lb5=new JLabel(" Engine Run < 650km");
jf2.add(lb1);
jf2.add(lb2);jf2.add(lb3);jf2.add(lb4);jf2.add(lb5);
lb1.setBounds(680,20,200,180);
lb2.setBounds(150,60,700,300);
lb3.setBounds(150,100,700,300);
lb4.setBounds(150,140,700,300);
lb5.setBounds(150,180,700,300);
jf2.setSize(2500,2500);
jf2.setLayout(null);
jf2.setVisible(true);
    }

}


    




