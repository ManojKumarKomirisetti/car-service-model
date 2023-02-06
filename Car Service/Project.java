package CAR;
import CAR.CarDetail;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Project extends JFrame
{
    int EOil; 
    int p,d;
    int p1,d1,e1;
public void Result()
    {
 int pet[]=new int[6];
    int dist[]=new int[6];
pet[1]=75;
pet[2]=110;
pet[3]=45; 

dist[1]=350;
dist[2]=650;
dist[3]=210;
 EOil=2;
 p=p+p1;
 d=d+d1;
 EOil=EOil+e1;
 for(int i=0;i<6;i++)
{
     p=p+pet[i];
     d=d+dist[i];
}  
 CAR.CarDetail obj=new CAR.CarDetail();

if(d>650 && p>150)
    {
        if(EOil<=2)
        {
     obj.Manoj();
        }
        else{
            obj.Manoj1();
        }

    }
    else
{
obj.Manoj2();
}

    }


public void Result1()
{
  try{
    FileInputStream fis1=new FileInputStream("Month51.txt");
DataInputStream dis1= new DataInputStream(fis1);
FileInputStream fis2=new FileInputStream("Month52.txt");
DataInputStream dis2= new DataInputStream(fis2);
FileInputStream fis3=new FileInputStream("Month53.txt");
DataInputStream dis3= new DataInputStream(fis3);
d1=dis1.readInt();
//System.out.println(p1);
e1=dis2.readInt();
//System.out.println(d1);
p1=dis3.readInt();
dis1.close();
fis1.close();
dis2.close();
fis2.close();
dis3.close();
fis3.close();
    }
    catch(Exception e)
    {}
    //CAR.CarDetail obj=new CAR.CarDetail();
 JFrame jf7=new JFrame("NewMonth");
JLabel l1,l2,l3,l4,l5;
l1=new JLabel("**REPORT**");
l2=new JLabel("*Your Vechile Covered a Distance of  740 KiloMeters.");
l3=new JLabel("*Vechile Has Consumed Fuel around 220 Litres.");
l4=new JLabel(" *Engine Oil has  Changed Still Using 'Helix Ultra'.");
l5=new JLabel(" *Fuel Cost=17600");
jf7.add(l1);
jf7.add(l2);jf7.add(l3);jf7.add(l4);jf7.add(l5);
l1.setBounds(680,20,200,180);
//lb1.setForeground(color.red);
l2.setBounds(150,60,700,300);
l3.setBounds(150,100,700,300);
l4.setBounds(150,140,700,300);
l5.setBounds(150,180,700,300);
jf7.setLayout(null);
//jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf7.setSize(2500,2500);
jf7.setVisible(true);

/*if(d1>650 && p1>150)
    {
        if(e1<2)
        {
     obj.Manoj();
        }
        else{
            obj.Manoj1();
        }

    }
    else
{
obj.Manoj2();
}*/
    
}
}
