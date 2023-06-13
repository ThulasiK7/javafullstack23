import java.io.*;
class BufferReaderex1{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
String name="";
while(!name.equals("s")){
System.out.println("enter");
name=br.readLine();
System.out.println(name);

}}}