import java.io.*;
class Fileread1{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\tk\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i;
while((i=br.read())!=-1){
System.out.print((char)i);

}}}