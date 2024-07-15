package COM.HLCODING.OOPS.InterfaceTopic.VarAndDataMember.VarKeywordConcept;

public class Test implements Test1,Test2{
    @Override
    public void m1() {
        System.out.println("inside interface Test m1 method ");

    }

    @Override
    public void m2() {
        System.out.println("inside interface Test m1 method ");
    }

    public static void main(String[] args) {
        var obj = new Test();
        //So using this var keyword concept we can acces all inteface method instead of passing the ref of
        //particular interface and and accesing it it applied in java 1.9
        obj.m1();
        obj.m2();

        // There is a drawback of var keyword : we can't create the object on class leval
        // we have to create the object or pass the ref any class in a method
    }

    //Suppose we are passing the obj and ref of class outside the class instead of in a particular method
    //var obj1 = new Test();
    //Here we will get compile time error var keyword cannot resolve
}
