import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;
import CAR.*;
import CAR.Project;

public  class Page extends JFrame implements ActionListener
{
    int b;

    String Name="";
    String Pass="";
     String UserName=null;
    String Pin=null;
    JButton jb,jb1, jb2,jb3,jb4;
    JCheckBox cb;
    JTextField tf1,tf2,tf3,tf4;
    JPasswordField pf;
    JLabel l1,l2,l3,l4,l5,logo;
    JList l;
    JComboBox cb1;
     String mlist[]={"Month","Month 1","Month 2","Month 3"};
     public Page()
     {
super("Sign In Page");
logo=new JLabel(new ImageIcon("Logo.png"));
this.add(logo);
logo.setBounds(100,50,600,600);
l4=new JLabel("User Name:");
this.add(l4);
l4.setBounds(850,223,100,20);

l5=new JLabel("Password:");
this.add(l5);
l5.setBounds(850,283,100,20);

tf3=new JTextField();
this.add(tf3);
tf3.setBounds(1000,223,400,40);

tf4=new JTextField();
this.add(tf4);
tf4.setBounds(1000,283,400,40);

jb3=new JButton("Submit");
this.add(jb3);
jb3.addActionListener(this);
jb3.setBounds(1100,450,100,40);
this.setLayout(null);
this.setSize(2500,2500);
this.setVisible(true);
     } 


 public void Page1(int a,int b)
{
    JFrame j6=new JFrame("Car Service Login");
l1=new JLabel("User Name:");
j6.add(l1);
l1.setBounds(500,250,100,20);

l2=new JLabel("Password:");
j6.add(l2);
l2.setBounds(500,300,100,20);

tf1=new JTextField();
j6.add(tf1);
tf1.setBounds(680,250,400,40);

pf=new JPasswordField();
j6.add(pf);
pf.setBounds(680,300,400,40);

cb=new JCheckBox("NOT ROBOT");
j6.add(cb);
cb.setBounds(590,370,100,60);

jb=new JButton("Submit");
j6.add(jb);
jb.addActionListener(this);
jb.setBounds(650,500,100,40);

j6.setSize(2500,2500);
j6.setLayout(null);
j6.setVisible(true);
}

public void Page2(int a)
{
    JFrame jf=new JFrame("Car Service");
/*tf2=new JTextField();
jf.add(tf2);
tf2.setBounds(700,150,400,400);*/
     cb1=new JComboBox(mlist);
        cb1.setBounds(80,200,150,60);
        cb1.addActionListener(this);
        jf.add(cb1);
        jb1=new JButton("New Month");
jf.add(jb1);
jb1.addActionListener(this);
jb1.setBounds(350,150,120,60);

 jb2=new JButton("RESULT");
jf.add(jb2);
jb2.addActionListener(this);
jb2.setBounds(350,400,120,60);

 jb4=new JButton("NResult");
jf.add(jb4);
jb4.addActionListener(this);
jb4.setBounds(350,680,120,60);

jf.setSize(2500,2500);
jf.setLayout(null);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setVisible(true);
}
///////





public void actionPerformed(ActionEvent ae)//throws Exception
        {
            CAR.CarDetail obj=new CAR.CarDetail();
 CAR.MonthPic obj1=new CAR.MonthPic();
 CAR.Project obj2=new CAR.Project();

 if(ae.getSource()==jb3)
{
    Name=tf3.getText();
    Pass=tf4.getText();
   Page1(1,2);
}
if(ae.getSource()==jb)
{
    UserName=tf1.getText();
 Pin=new String(pf.getPassword());
    if((Name).equals(UserName) && (Pass).equals(Pin))
    {
    Page2(1);
  }
  else
{
    obj1.incorrect();
}
}  
if(cb1.getSelectedIndex()==1)
{
  obj1.Month1();
}

if(cb1.getSelectedIndex()==2)
{
 obj1.Month2();
}
if(cb1.getSelectedIndex()==3)
{
 obj1.Month3();
}
if(ae.getSource()==jb1)
{
   obj1.NewMonth();
} 
if(ae.getSource()==jb2)
{
    obj2.Result();
}

if(ae.getSource()==jb4)
{
    obj2.Result1();
}
        }



public static void main(String Args[])
{
new Page();
}

}