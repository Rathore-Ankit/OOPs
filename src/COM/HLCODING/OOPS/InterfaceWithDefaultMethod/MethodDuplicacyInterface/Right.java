package COM.HLCODING.OOPS.InterfaceWithDefaultMethod.MethodDuplicacyInterface;

public interface Right {
    /*public void run()
    {
        // we cannot delcare the body of the abstract method into interface
        // we have to just declare method name
    }*/

    default void run()
    {
        System.out.println("right interface run method called");
    }
}
