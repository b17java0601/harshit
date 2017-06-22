
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class OOPS {
	
static String name,des;
static int salary,num;
static float code;


static InputStreamReader i=new InputStreamReader(System.in);
static BufferedReader br=new BufferedReader(i);

static void input() throws IOException
{
	System.out.println("enter the no of employee");
	num=Integer.parseInt(br.readLine());
	for(int j=0;j<num;j++)
	{	
	System.out.println("enter your name");
	name=br.readLine();
	System.out.println("enter your designation");
	des=br.readLine();
	System.out.println("enter Salary");
	salary=Integer.parseInt(br.readLine());
	System.out.println("enter your employee code");
	code=Float.parseFloat(br.readLine());
	}
}

static void display() throws IOException
{
	System.out.print("name"+"\n"+name+"\n"+"designation"+"\n"+des+"\n"+"salary"+"\n"+salary+"\n"+"code"+"\n"+code+"\n");
}
public static void main(String args[]) throws IOException
{
	
	OOPS s=new OOPS();
	s.input();
	
System.out.println("detalis");
for(int i=0;i<num;i++)
s.display();
}
}
