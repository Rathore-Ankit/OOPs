package COM.HLCODING.OOPS.InterfaceTopic.MultipleInheritance;

public class Main {
    public static void main(String[] args) {
        Child c1 =new Child();
        c1.m1();
       // c1.Parent1.m1(); // here we cannot called direct parent1 m1 method
        // we can call using super keyword and child m1 method


    }
}
