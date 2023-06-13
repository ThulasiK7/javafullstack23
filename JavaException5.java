public class JavaException5
{
public static void main(String args[])
{
int i=50;
int j=0;
int data;

try{
data=i/j;

//System.out.println("rest of the code..");

}catch(Exception e){System.out.println(i/(j+2));}
}
}