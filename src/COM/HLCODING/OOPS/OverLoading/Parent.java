package COM.HLCODING.OOPS.OverLoading;

public class Parent {

    public  void m1()
    {
        System.out.println(" inside parent m1");
    }

    protected float m1( float a)
    {
        return a;
    }
    //here we have two  m1 method with same name and different parameter

    //can we overload the main method

    public static void main(String[] args) {
        System.out.println("inside oriagnal main");
        main("ankit");  //here we are overloading main method
        // but we can not override the main method
    }

    public static String main(String z)
    {
        return z;
    }

    //here we can see that ki we can overload the main method
}
