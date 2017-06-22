import java.util.Scanner;
class binary
{
public static void main(String args[])
{
int i,num[],term,x=0,mid,y;
num=new int[5];
System.out.println("enter five no");
Scanner s=new Scanner(System.in);
for(i=0;i<num.length;i++)
{
num[i]=s.nextInt();
}
System.out.println("enter term to find");
term=s.nextInt();
y=num.length/2;
mid=num[num.length/2];
if(term==mid)
{
System.out.println("found"+term+"at"+(y+1)+"place");
}
if(term<mid)	
{
for(i=0;i<y;i++)
{
if(term==num[i])
{	
System.out.println("found"+term+"at"+(i+1)+"place");
break;
}
}
}
else if(term>mid)
{
for(i=y+1;i<num.length;i++)
{
if(term==num[i])	
{	
System.out.println("found"+term+"at"+(i+1)+"place");
break;
}
}
}
}
}

