import java.util.Scanner;
class User
{
public static void main(String args[])
{
int arr[]={1,2,3};
int acc[]={4,5,6};
 System.out.println("array 1");
 for(int i=0;i<arr.length;i++)
 {
 System.out.println(arr[i]);
 }
 System.out.println("array 2");
 for(int j=0;j<acc.length;j++)
 {
 System.out.println(acc[j]);
 } 
  User s=new User();
 s.add(arr, acc);
 }
 void add(int[]a,int[]b)
 {
	 System.out.println("array 1");
for(int k=0;k<a.length;k++)
 {
 System.out.println(a[k]);
 }
 System.out.println("array 2");
 for(int u=0;u<b.length;u++)
 {
 System.out.println(b[u]);
 }
 }
}
 
 
