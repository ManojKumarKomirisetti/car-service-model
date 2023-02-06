import java.io.*;
class Dos
{
public static void main(String Args[])
throws IOException
{
FileOutputStream fos1=new FileOutputStream("Month51.txt");
DataOutputStream dos1= new DataOutputStream(fos1);
FileOutputStream fos2=new FileOutputStream("Month52.txt");
DataOutputStream dos2= new DataOutputStream(fos2);
FileOutputStream fos3=new FileOutputStream("Month53.txt");
DataOutputStream dos3= new DataOutputStream(fos3);
int x=750;
int d=220;
int E=3;
//String str=" welcome to DataOutputStream";
/*String Not working"*/
dos1.writeInt(x);
dos2.writeInt(E);
dos3.writeInt(d);
//dos.flush();
dos1.close();
fos1.close();
dos2.close();
fos2.close();
dos3.close();
fos3.close();
}
}