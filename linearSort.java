import java.util.Scanner;
class linear
{
public static void main(String args[])
{
int i,num[],term,x=0;
num=new int[5];
System.out.println("enter five no");
Scanner s=new Scanner(System.in);
for(i=0;i<num.length;i++)
{
num[i]=s.nextInt();
}
System.out.println("enter term to find");
term=s.nextInt();
for(i=0;i<num.length;i++)
{
if(term==num[i])
{
System.out.println("found at"+(i+1)+" "+term);
break;
}
if(term!=num[i] && x==4)
System.out.println("not found");
x=x+1;
}
}
}

