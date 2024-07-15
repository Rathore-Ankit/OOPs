package COM.HLCODING.OOPS.DefaultSpecifier;

public class Default1 {

    //here we will discuss about the default method
    public void m1()
    {
        System.out.println("this is a pulblic method");
    }

    private void m2()
    {
        System.out.println("this is a private method");
    }
    public void m3(){
        System.out.println("this is a protected method");
    }

    void DefMethod()
    {
        System.out.println("this is default method");
    }

    // so we can acces the default method only with in the same package
    //outside we can't access it
}
