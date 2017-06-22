public class User {
    public static void main(String args[])
    {
           int i,j,k;
        System.out.println("limit b/w 1 and  "+limit);
        for(i=1;i<=5;i++)
        {int count=0;
        for(k=1;k<=i*3;k++)
        {
            
            boolean isPrime=true;
                for(j=2;j<=k/2;j++)
                {
                    if(k%j==0)
                    {
                    isPrime=false;
                   
                    break;
                    }
                }
                
        if((isPrime==true)&&(count<i))
        {
            System.out.print(k);
        count++;
        }
        }
        System.out.println();
        }
    }}

