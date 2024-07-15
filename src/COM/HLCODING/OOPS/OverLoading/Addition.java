package COM.HLCODING.OOPS.OverLoading;
//perfect example for operator overloading in java
public class Addition {
    public int sum()
    {
        System.out.println("inside Additon default sum method");
        return 0;

    }

    public int sum(int a, int b)
    {
        return a+b;
    }

    public double sum( double a, double b)
    {
        return  a+b;
    }

    protected String sum(String x, String y)
    {
        return x+y;
    }
}
