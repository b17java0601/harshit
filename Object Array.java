import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Obj {
	
 String name,des;
 int salary;
 float code;
 static int num;


 

 void input(BufferedReader br) throws IOException
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

 void display() throws IOException
{
	System.out.print("name"+"\n"+name+"\n"+"designation"+"\n"+des+"\n"+"salary"+"\n"+salary+"\n"+"code"+"\n"+code+"\n");
}
public static void main(String args[]) throws IOException
{
	InputStreamReader r=new InputStreamReader(System.in);
	  BufferedReader br=new BufferedReader(r);
	  
	System.out.println("enter the no of employee");
	num=Integer.parseInt(br.readLine());
	
	Obj[] s=new Obj[num];
	
	for(int i=0;i<s.length;i++)
	{
	s[i]=new Obj();
	s[i].input(br);
	}
	
	
System.out.println("detalis");
for(int i=0;i<num;i++)
s[i].display();
}
}
