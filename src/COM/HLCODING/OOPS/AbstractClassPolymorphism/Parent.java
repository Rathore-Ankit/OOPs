//This is am example of Abstract class based  Polymorphism\
 package COM.HLCODING.OOPS.AbstractClassPolymorphism;

public abstract class Parent {
//    public  abstract  void m1()
//    { }
// we cannot declare the body of a abstract method because abstract is a incomplete method
    // we have to only declare the method
    // and we cannot create the object of abstract class

    // evry abstract class can have concrit (static/non-static mehtod) and absract mehtod
    //and evry abstract class abstract method implemented in its child classes
    public abstract void m1();
    public abstract void m2();

    public void m3()
    {
        //this is non abstract method
    }
}


