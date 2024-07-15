package COM.HLCODING.OOPS.InterfaceWithDefaultMethod;

public interface DefaultMethodInterface {

    public void m1();

    public void m2();

//    default void m3(); here we can not declare the code
  //  we have to explicitly declaere the code  and implement the default method

    default void m3()
    {
        System.out.println("defualt interface method code");
    }

//    String s = "1234";
//    int i =Integer.parseInt(s); // parseInt() method use to convert string to integar data type
//        System.out.println(" this is a int type data: " +i);
    // this is used to convert the string to integar data type



}
