package COM.HLCODING.OOPS.InterfaceTopic.TypesOfInterface;

public interface Test1 {
    public void m1(); //this is by default public and abstract
    public void m4();
    public static void m2(){
        //after java 1.7 this version realsed
    }
    default void m3()
    {
        //after java 1.7 this version realsed
    }
}
//So in normal interface we can create static abstaract and default method
//and we can also implement some abstract method in class
// amd rest method into another class easily
interface test2{
    public void m5();

}
abstract class tM1imple1 implements Test1 ,test2 {
    @Override
    public void m1() {

    }

}


class  tM2imple1 extends tM1imple1
{
    @Override
    public void m4() {

    }

    @Override
    public void m5() {
        //here we are giving another interface test ( m5 method implementation)

    }
}

