public class User {
    public static void main(String args[])
    {
        int i,k,j,n,p;
        char s;
         Scanner s1=new Scanner(System.in);
        System.out.println("enter d no. of lines ");
        n=s1.nextInt();
       
        for(i=0;i<=n-1;i++)
        {
            for(j=n-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(k=0;k<=i;k++)
            {
                p=97+k;
                s=(char)p;
                System.out.print(s);
            }
            for(k=i-1;k>=0;k--)
            {
                p=97+k;
                s=(char)p;
                System.out.print(s);
            }
            System.out.println();
        }
        
        for(i=n-1;i>=1;i--)
        {
            for(j=n;j>=i;j--)
            {System.out.print(" ");
            }
            for(k=0;k<i;k++)
            {
                p=97+k;
                s=(char)p;
                System.out.print(s);
            }
            for(k=0;k<i-1;k++)
            {
               
               
               p=97+k;
                s=(char)p;
                System.out.print(s);
            }System.out.println();
        }
    }
    
}
