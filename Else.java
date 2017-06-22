import java.util.Scanner;

class User
{
public static void main(String args[])
{
int num;
char gen[80];
Scanner s=new Scanner(System.in);
System.out.println("enter your gender");
gen[80]=s.nextLine();
System.out.println("enter your age");
num=s.nextInt();
if(gen=='male' && num>=21)
System.out.println("eligeble");
else if(gen=='female' && num>=18)
System.out.println("eligeble");
else
System.out.println("not eligeble");
}
}
