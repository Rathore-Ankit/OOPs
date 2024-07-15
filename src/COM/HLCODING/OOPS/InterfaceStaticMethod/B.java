package COM.HLCODING.OOPS.InterfaceStaticMethod;

public class B  implements A{

    public void m1()
    {

    }
     public void m2()
     {
         System.out.println("this is child clas m2 method");
         A.super.m2();
     }
}
