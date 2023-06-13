import java.io.*;
class FilereadCountNumbers{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\tk\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i,count=0;

while((i=br.read())!=-1){
if((char)i>='0'&&(char)i<='9') count++;}
System.out.print(count);

}}