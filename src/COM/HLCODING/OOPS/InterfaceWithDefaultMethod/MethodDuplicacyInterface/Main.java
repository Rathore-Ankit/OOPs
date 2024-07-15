package COM.HLCODING.OOPS.InterfaceWithDefaultMethod.MethodDuplicacyInterface;

public class Main {
    public static void main(String[] args) {
     //  Demo d1= new Demo(); // here we are passing demo class object that's why demo class run method invoked
        //d1.run();
        //this is way to called method run

      Left l1 = new Demo(); // parent interface ref and child demo class object
      l1.run(); // we cannot do this because we cannot pass the ref of interface
        //if we want to achieve interface run () method first we need to implement the  left interface and
        // implement the run method and acces it using method object and interface ref

      //  Demo d3 = new Left();//we cannot acces to this way]







    }
}
