public class User {
    public static void main(String args[])
    {
                 int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter d no. of lines ");
        n=s.nextInt();
        
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("\n");
        }

    }
    
}
