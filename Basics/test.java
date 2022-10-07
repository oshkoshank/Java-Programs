class data
{
    static final int a = 20;
    static final String b = "Hello mom";
    static final float c = 10.56f;
    static final double  d = 10.5893;
    int e = 100;
}

class test
{
    public static void main(String[] args) 
    {
        data o = new data();
        System.out.println(data.a);
        System.out.println(data.b);
        System.out.println(data.c);
        System.out.println(data.d);
        System.out.println(o.e);
    }
}