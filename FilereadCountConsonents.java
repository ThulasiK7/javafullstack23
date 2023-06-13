import java.io.*;
class FilereadCountConsonents{
public static void main(String args[])throws Exception{
FileReader fr=new FileReader("D:\\tk\\demo.txt");
BufferedReader br=new BufferedReader(fr);
int i,count=0;

while((i=br.read())!=-1){
if((char)i>='a'&&(char)i<='z'){
if((char)i!='a'&&(char)i!='e'&&(char)i!='i'&&(char)i!='o'&&(char)i!='u'&&(char)i!='A'&&(char)i!='E'&&(char)i!='I'&&(char)i!='O'&&(char)i!='U'){  count++;}}}
System.out.print(count);

}}