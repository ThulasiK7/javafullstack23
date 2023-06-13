class Array_average{
public static void main(String args[]){
int[] age={12,4,5,67};int sum=0;
for(int i:age)//for each loop
sum+=i;
int arrlen=age.length;
int average=sum/arrlen;
System.out.println(average);}}