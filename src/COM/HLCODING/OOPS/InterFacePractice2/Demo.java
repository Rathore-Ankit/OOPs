package COM.HLCODING.OOPS.InterFacePractice2;

public class Demo implements A , B{
    public void m1()
    {
        //System.out.println("inside demo class invoked");
        A.super.m1(); // it will call class A m1 method
        B.super.m1(); // it will call class B m1 method
    }

}
