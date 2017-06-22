import java.util.Scanner;

class User
{
public static void main(String args[])
{
int num,var=1;
Scanner s=new Scanner(System.in);
System.out.println("enter a number");
num=s.nextInt();
for(int x=num;x>0;x--)
var=x*var;
System.out.println(var);
}
}


