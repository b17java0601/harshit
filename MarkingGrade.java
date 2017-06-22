import java.util.Scanner;

class User
{
public static void main(String args[])
{
int mar;
Scanner s=new Scanner(System.in);
System.out.println("enter your marks");
mar=s.nextInt();
if(mar>=85 && mar<100 )
System.out.println("excellent");
else if(mar>70 && mar<85)
System.out.println("very good");
else if(mar>50 && mar<70)
System.out.println("good");
else if(mar>40 && mar<50)
System.out.println("average");
else if(mar>0 && mar<40)
System.out.println("fail");
else
System.out.println("wrong input");
}
}






