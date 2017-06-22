import java.util.Scanner;
 
class User
{
public static void main(String args[])
{
int num,rev=0,x;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
num=s.nextInt();
for(x=num;num>0;)
{
x=num%10;
rev=rev*10+x;
num=num/10;
}
System.out.println(rev);
}
}
