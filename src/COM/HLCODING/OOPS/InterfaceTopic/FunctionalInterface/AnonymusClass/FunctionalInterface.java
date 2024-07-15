package COM.HLCODING.OOPS.InterfaceTopic.FunctionalInterface.AnonymusClass;

import org.w3c.dom.ls.LSOutput;

public interface FunctionalInterface {
    public abstract void m1();
    public abstract void m2();

}
//those interface who have only one abstract method is called functional interface
//functional interface applied those class which have only annonymus class and lemda class (internaly lemda class)
//funvtional interface is also the third type of the interface

class Funimple
{
    public static void main(String[] args) {
        FunctionalInterface f1 = new FunctionalInterface() {
            @Override
            public void m1() {
                System.out.println("inside functional interface m1 method implementation in f1 object  ");
            }

            @Override
            public void m2() {

            }
        };
        f1.m1();


        FunctionalInterface f2  = new FunctionalInterface() {
            @Override //this is called anotation
            public void m1() {
                //here we are implemeting m1 method in object f2
            }
//                System.out.print(f2.getClass().getName());
            //here we are creating another class in main method

            @Override
            public void m2() {

            }
        }; //semicolon is mandetory to close the any method

        f2.getClass().getName();


        //Now we x
    }
}

//functional interface have more thaj one abstract in the apporach of anonymus class

//so in anonymus class we create another class into a method implementation