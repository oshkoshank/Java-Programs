class defaulttest
{
    int a;
    float b;
    double c;
    String e;
    boolean f;

  public void print()
  {
    System.out.println("Defalut value of int is "+ a);
    System.out.println("Defalut value of float is "+b);
    System.out.println("Defalut value of double is "+c);
    System.out.println("Defalut value of String is "+e);
    System.out.println("Defalut value of boolean is "+f);
  }
}
 class default_print
{
    public static void main(String[] args) 
    {
        defaulttest o = new defaulttest();
        o.print();
    }
}