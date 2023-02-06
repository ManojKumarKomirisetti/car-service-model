package CAR;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.awt.Color.*;
import java.awt.Dimension;
 public class MonthPic extends JFrame
{
JButton jb;
          JTextField tf1,tf2;
 static String Dist1=null;
 static String Fuel=null;
static int km,pet,cost;
    public void Month1()
    {
        JFrame jf2=new JFrame("Month2");
          JLabel lb1,lb2,lb3,lb4,lb5;
lb1=new JLabel("**REPORT**");
lb2=new JLabel("*Your Vechile Covered a Distance of  350 KiloMeters.");
lb3=new JLabel("*Vechile Has Consumed Fuel around 75 Litres.");
lb4=new JLabel(" *Engine Oil has  Changed Still Using 'Castrol Magnatec'.");
lb5=new JLabel(" *Fuel Cost=4000");
jf2.add(lb1);
jf2.add(lb2);jf2.add(lb3);jf2.add(lb4);jf2.add(lb5);
lb1.setBounds(680,20,200,180);
//lb1.setForeground(color.red);
lb2.setBounds(150,60,700,300);
lb3.setBounds(150,100,700,300);
lb4.setBounds(150,140,700,300);
lb5.setBounds(150,180,700,300);
jf2.setSize(2500,2500);
jf2.setLayout(null);
//jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf2.setVisible(true);

    }




   public void Month2()
    {
        JFrame jf2=new JFrame("Month2");
          JLabel lb1,lb2,lb3,lb4,lb5;
lb1=new JLabel("**REPORT**");
lb2=new JLabel("*Your Vechile Covered a Distance of  560 KiloMeters.");
lb3=new JLabel("*Vechile Has Consumed Fuel around 110 Litres.");
lb4=new JLabel(" *Engine Oil has  Changed To 'Mobil Extra'.");
lb5=new JLabel(" *Fuel Cost=4960");
jf2.add(lb1);
jf2.add(lb2);jf2.add(lb3);jf2.add(lb4);jf2.add(lb5);
lb1.setBounds(680,20,200,180);
//lb1.setForeground(color.red);
lb2.setBounds(150,60,700,300);
lb3.setBounds(150,100,700,300);
lb4.setBounds(150,140,700,300);
lb5.setBounds(150,180,700,300);
jf2.setSize(2500,2500);
jf2.setLayout(null);
//jf2.setDefaultCloseOperation(jf2.EXIT_ON_CLOSE);
jf2.setVisible(true);

    }




    public void Month3()
    {
        JFrame jf2=new JFrame("Month3");
          JLabel lb1,lb2,lb3,lb4,lb5;
lb1=new JLabel("**REPORT**");
lb2=new JLabel("*Your Vechile Covered a Distance of  210 KiloMeters.");
lb3=new JLabel("*Vechile Has Consumed Fuel around 45 Litres.");
lb4=new JLabel(" *Engine Oil has not Changed Still Using 'Mobil Extra'.");
lb5=new JLabel(" *Fuel Cost=3600");
jf2.add(lb1);
jf2.add(lb2);jf2.add(lb3);jf2.add(lb4);jf2.add(lb5);
lb1.setBounds(680,20,200,180);
//lb1.setForeground(color.red);
lb2.setBounds(150,60,700,300);
lb3.setBounds(150,100,700,300);
lb4.setBounds(150,140,700,300);
lb5.setBounds(150,180,700,300);
jf2.setSize(2500,2500);
jf2.setLayout(null);
//jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf2.setVisible(true);

    }

public void incorrect()
{
     JFrame f=new JFrame();   
    JOptionPane.showMessageDialog(f,"UserName/Password Wrong","Alert",JOptionPane.WARNING_MESSAGE);  
}


     public void NewMonth()
    {
       JFrame jf= new JFrame("New Month");
          JLabel l1,l2;
l1=new JLabel("Distance:");
jf.add(l1);
l1.setBounds(500,250,100,20);

l2=new JLabel("Fuel:");
jf.add(l2);
l2.setBounds(500,300,100,20);

tf1=new JTextField();
jf.add(tf1);
tf1.setBounds(680,250,400,40);

tf2=new JTextField();
jf.add(tf2);
tf2.setBounds(680,300,400,40);


jb=new JButton("Submit");
jf.add(jb);
//jb.addActionListener(this);
jb.setBounds(650,500,100,40);


jf.setSize(2500,2500);
jf.setLayout(null);
jf.setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)//throws Exception
        {
if(ae.getSource()==jb)
{
 Dist1=tf1.getText();
 Fuel=tf2.getText();
    km=Integer.parseInt(Dist1);
    pet=Integer.parseInt(Fuel);
   cost=pet*80;
     System.out.println(Fuel);
   try{
    FileOutputStream fos=new FileOutputStream("NewMonth1.txt");
    DataOutputStream dos=new DataOutputStream(fos);
    dos.writeInt(km);
    dos.writeInt(pet);
     dos.writeInt(cost);
     dos.close();
     fos.close();
   }
   catch(Exception e){}
}  
        }
}