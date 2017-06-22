class A
{
public static void main(String args[])
{
   int arr[][]={{1,2,3},{9,5},{6,7,8,4}};
   
    System.out.println("The maximum element is "+max(arr));
}
    
    static int max(int[][]a)
    {
    int m=a[0][0];   
    
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
    {
        if(a[i][j]>m)
            m=a[i][j];
    }
    }
    return(m);
    
    }}


