import java.util.Scanner;

import javax.sound.midi.Soundbank;

/**
 * hacke_code
 */
//import java.util.*;
public class hacke_code 
{
    public static void main(String[] args) 
    {
    long start = System.nanoTime();
    String a[] = {"", "one","two","three","four","five","six","seven","eight","nine"};
    Scanner o = new Scanner(System.in);
    System.out.println("Enter the lower limit: ");
    int n = o.nextInt();
    System.out.println("Enter the upper limit: ");
    int m = o.nextInt();
    for (int i = n; i <= m; i++) 
    {
       while (i<10) 
       {
            System.out.println(a[i]); 
            i++;
       }
      if (i%2 == 0) 
      {
        System.out.println("even");
      }
      else
      {
        System.out.println("odd");
      }
    }
    o.close();
    long duration = (System.nanoTime() - start);
    System.out.println("duration = " + duration + " nanoseconds" );
}
}

/*
  for(int i = n; i <= m; i++)
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
 */