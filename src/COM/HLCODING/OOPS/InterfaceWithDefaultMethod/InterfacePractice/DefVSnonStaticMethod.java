package COM.HLCODING.OOPS.InterfaceWithDefaultMethod.InterfacePractice;

public interface DefVSnonStaticMethod {
    default void m1()
    {
        //2 line def code
        m3();
    }
    default void m2()
    {
        //2 line def code
        m3();
    }

    //this two method have two line duplicate code so we will write into another method and call it

/*   default void m3()
    {
       //there is some problem in this code if we call the m3 method into m1 and m2
        // if some one want to override the m1 and m2 so they have to implement the m3 as well
       // for the solution we will declare the method as static
       // interface acess the static method
       // this method will be called at the time of object creation
    }*/

    public static void m3()
    {
        // this is non overridden method and usable in one class or interface
        // this method will called at the time class loading
    }
}
