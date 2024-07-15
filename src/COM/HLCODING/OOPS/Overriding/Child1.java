package COM.HLCODING.OOPS.Overriding;

public class Child1 extends Parent {

    public static void main ( String args [])
    {

    }
    public static void m3()
    {
        System.out.println("inside child1 m3");
    }

    public static void m4()
    {
        System.out.println("imside child m4");
    }

    public void m1() //this is overidden method
    {
        System.out.println("inside child1 override m1 called");
    }
}
