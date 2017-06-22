import java.util.Scanner;

class User
{
public static void main(String args[])
{
int num,i,x=0,y;
Scanner s=new Scanner(System.in);
System.out.println("enter a no");
num=s.nextInt();
y=num;
for(i=num;i>0;)
{
i=num%10;
x=x+(i*i*i);
num=num/10;
}
if(x==y)
System.out.print("armstrong");
else
System.out.print("its not");
}
}
	






