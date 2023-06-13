import java.io.*;
class BufferReaderex{
public static void main(String args[])throws Exception{
InputStreamReader r=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(r);
String name=br.readLine();
System.out.println("welcome "+name+"...");
}}