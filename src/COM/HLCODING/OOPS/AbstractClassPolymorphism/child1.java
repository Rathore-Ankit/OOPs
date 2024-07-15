package COM.HLCODING.OOPS.AbstractClassPolymorphism;



    public abstract class child1 extends Parent{
    public abstract  void m1();

    public void m2()
    {
        System.out.println("method m2 implemented");
        //here we are implementing parent class abstract method instead of that the class will be abstrct
        // due to one more abstracr m1 method
    }

}

// if we are not implementing parent class  method into child
// we have to declare class as abstract and also method as abstract
