import java.util.*;
class TestNuminStr{
static boolean isNum(String s){
for(int i=0;i<s.length();i++){
if(Character.isDigit(s.charAt(i))==false)return false;}
return true;
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.next();
if(isNum(str))System.out.println("INT");
else System.out.println("Str");}}