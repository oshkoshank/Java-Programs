
/**
 * hacke_code
 */
import java.util.*;
public class hacke_code 
{
    public static void main(String[] args) 
    {
    String a[] = {"", "one","two","three","four","five","six","seven","eight","nine"};
    Scanner o = new Scanner(System.in);
    System.out.println("Enter the lower limit: ");
    int n = o.nextInt();
    System.out.println("Enter the upper limit: ");
    int m = o.nextInt();
    for (int i = n; i <= m; i++) 
    {
      if(i < 10)
    {
        System.out.println(a[i]);
    }
    else
    {
        if(i%2 == 0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
o.close();
}
}

