import java.util.Scanner;

public class User {
    public static void main(String args[])
    {
         int i,n;
        Scanner s=new Scanner(System.in);
        System.out.println("Grade");
        System.out.println("enter your marks");
        n=s.nextInt();
        i=n/10;
        if(i>100)
        System.out.println("wrong input");
        
        switch (i)
        {
        case 1:
        case 2:
        case 3:
        	System.out.println("fail");
        	break;
        case 4:
        	System.out.println("average");
        	break;
        case 5:
        case 6:
        	System.out.println("good");
        	break;
        case 7:
        	System.out.println("very good");
        	break;
        case 8:
        	System.out.println("excellent");
        	break;
        default:
        
        	System.out.println("wrong input");
        	
        }
    }
    }