import java.util.Scanner;
class User
{
public static void main(String args[])
{
int i,num[],j,temp;
num=new int[5];
System.out.println("enter five no");
Scanner s=new Scanner(System.in);
for(i=0;i<num.length;i++)
{
num[i]=s.nextInt();
}
System.out.println("Buble sort");
for(i=0;i<num.length;i++)
{
for(j=i+1;j<num.length;j++)
{	
if(num[i]>num[j])
{
temp=num[i];
num[i]=num[j];
num[j]=temp;
}
}
}
for(i=0;i<num.length;i++)	
System.out.println(num[i]);	
}
}
