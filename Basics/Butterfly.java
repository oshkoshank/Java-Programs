import java.util.*;
class Butterfly
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt()*2;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if((j==i) || (n-j-1==i) || (j==n-1) ||(j==0))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    }