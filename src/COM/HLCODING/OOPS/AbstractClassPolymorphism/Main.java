package COM.HLCODING.OOPS.AbstractClassPolymorphism;

public class Main {
    public static void main(String[] args) {
       // Parent p1 = new Parent() ; //first we cannot create the abstract class object
        //because every abstract class have some incomplete methods

        // we can also pass the ref of any abstract  parent class

        Parent p1 = new child2();p1.m1(); //m1 implemented in child2 class
        p1.m2(); //m2 implemented in child2 class

        //instead of that we can access using same parent reference
        }
}
