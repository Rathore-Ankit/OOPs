package COM.HLCODING.OOPS.InterfaceTopic.MultipleInheritance;

public  class Child implements Parent1, Parent2 {

    public void m1()
    {
        System.out.println("child class own m1 method invoked");
        //it willl call child class m1 method
        Parent1.super.m1();
        // it will call parent1 m1 method

        Parent2.super.m1();
        //it will call parent2 m1 method
    }
}
//Multiple Inheritance

//so here we are solving multiple inheritance diamond problem using inteface and default method