package COM.HLCODING.OOPS.InterfaceWithDefaultMethod.MethodDuplicacyInterface;

public class Demo implements Left,Right {


    @Override
    public void run() { // it will call demo class run method if we pass the demo class object
        Left.super.run(); //it will call left parent run method
        Right.super.run(); // it will call right parent run method
        System.out.println("Demo run method called");
    }
}

//note: we can pass the object of  interfaces but we cannot pass the reference of interface
