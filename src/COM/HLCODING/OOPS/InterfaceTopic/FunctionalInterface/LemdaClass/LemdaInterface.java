package COM.HLCODING.OOPS.InterfaceTopic.FunctionalInterface.LemdaClass;

public interface LemdaInterface {
    public abstract void m1();

}

//lemda functionality does not create the class its direct create the object

class Lemda {
    public static void main(String[] args) {
        LemdaInterface l1 = () ->{
            // here we will write m1 method implementation
        };
        l1.m1(); //AND USING l1 we can call it


        //again we can give new implementaion to m1

        LemdaInterface l2 = () ->{
            //again we will wrute the implementaion of m1 method
        };
    }
}

//when we have only one abstract method than we will use Functional interface lemda approach

// and when we have more than two abstract method than we will use interface anonymus class based (only for 3-5 abstract method)

//when we have no of abstract static default method then we will use normal interface approach

