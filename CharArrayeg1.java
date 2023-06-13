import java.io.*;
class CharArrayeg1{
public static void main(String args[])throws Exception{
char[] a={'t','k','b','s'};
CharArrayReader r=new CharArrayReader(a);
int k=0;
while((k=r.read())!=-1){
char ch=(char)k;
System.out.print(ch+":");
System.out.println(k);
}}}