import java.util.*;
class pattenrnnumber2{
public static void printline(int n){
for(int i=1;i<=n;i++){System.out.print(i);}}
public static void printpattern(int n){
for(int i=n;i>=1;i--){System.out.println();printline(i);}}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

printpattern(n);
}}