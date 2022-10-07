//import java.io.*;
/*public class HELLO_WORLD
{
    public static void main(String[] args) 
    {
        int a = 10 , b = 20;
        System.out.println(a+b);
    }
}
*/


import java.util.*;
public class HELLO_WORLD 
{
   public static void main(String[] args) 
   {
    Scanner obj = new Scanner(System.in);
    int[] a = new int[5];
    int y = 0;
    System.out.print("Enter the size: ");
    int n = obj.nextInt();
    System.out.print("Enter the array elements: ");
    for(int i = 0; i < n; i++)
    {
        a[i] = obj.nextInt();
    }
    for( int i = 0; i < n; i++)
    {
        if(a[i] % 2 == 0);
        {
         y += 1;
        }
    }
    System.out.print("The number of even numbers are " + y + " and the odd numbers are " + (n-y));
    obj.close();
  }
}

