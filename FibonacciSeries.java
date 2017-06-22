import java.util.Scanner;
 
class User
{
public static void main(String args[])
{
int num,a=0,b=1,c,i;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
num=s.nextInt();
System.out.println(a);
System.out.println(b);
for(i=1;i<num-1;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}

