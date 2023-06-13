import java.util.*;
class Triangle1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char c=sc.next().charAt(0);
int n=sc.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print("#");
}
for(int k=0;k<=n;k++){
System.out.print(c);}
for(int k=i-1;k>=1;k--){
System.out.print(c);}
System.out.println();
}}}