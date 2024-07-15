package COM.HLCODING.OOPS.InterfaceStaticMethod;

public class Main {
    public static void main(String[] args) {
        A a1 = new B();
        a1.m2();
        // a1.m3(); here we will get an error because interface can only invoked the static method and no one can invoked it

    }
}

