import java.util.*;
class DigitPattern2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=n;i>=0;i--)
{
for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}