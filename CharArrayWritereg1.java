import java.io.*;
class CharArrayWritereg1{
public static void main(String args[])throws Exception{

CharArrayWriter out=new CharArrayWriter();
out.write(".....THULASI...");
FileWriter f1=new FileWriter("D:\\tk\\a.txt");
FileWriter f2=new FileWriter("D:\\tk\\b.txt");
FileWriter f3=new FileWriter("D:\\tk\\c.txt");
out.writeTo(f1);
out.writeTo(f2);
out.writeTo(f3);f1.close();f2.close();f3.close();
System.out.println("success..");
}}