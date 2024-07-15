package COM.HLCODING.OOPS.InterfaceWithDefaultMethod.MethodDuplicacyInterface;

public interface Left {
//    public void run1();
//    // there is no need to give body of public abstract class

    default void run()  // this default method concept come after java 1.8
    {
        //but here it is complusory to give body of default method
        System.out.println("left interface run method called");
    }

}
