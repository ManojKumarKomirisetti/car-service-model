import java.io.*;
class Dis
{
public static void main(String Args[])
throws IOException
{
FileInputStream fis=new FileInputStream("Month5.txt");
DataInputStream dis= new DataInputStream(fis);
/*int count=fis.available();
byte arr[]=new byte[count];
dis.read(arr);
for(byte bt:arr)
{
int k=(char)bt;
System.out.print(k+"-");
}*/System.out.println(dis.readInt()+"\n"+dis.readInt()+"\n"+dis.readInt());
dis.close();
fis.close();
}
}