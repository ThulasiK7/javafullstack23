//UserDefined Exception
import java.util.*;
class LessMarksException extends Exception
{
String msg;
LessMarksException(String msg)
{
super(msg);
this.msg=msg;
}
public String toString()
{
return msg;
}
}
class Main1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String rollno=sc.next();
String name=sc.next();
int marks=sc.nextInt();
try
{
if(marks<0)
{
throw new LessMarksException("Less marks");
}
}
catch(LessMarksException ex)
{
System.out.println(ex);
System.out.println(ex.getMessage());
}
}
}
