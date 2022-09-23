import java.util.*;
public class compare 
{
    public static void main(String[] args)
     {
        Scanner o = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a = o.nextInt();
        System.out.println("Enter the Second number: ");
        int b = o.nextInt();
        System.out.println("Enter the Third number: ");
        int c = o.nextInt();
        int larg = ((a>b)&(a>c))?(a):((b>c?b:c));
        System.out.println("The largest number is "+ larg);
        o.close();
    }
}
