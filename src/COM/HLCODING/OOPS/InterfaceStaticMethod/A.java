package COM.HLCODING.OOPS.InterfaceStaticMethod;

public interface A {
    void m1(); // THIS METHOD IS By default public void abstract and their child class must be override it
    default void  m2() // this method is default and not compulsory to implement it into another method
    {
        m3();// we can use the inteface static method into same interface
        // and no one can access the interface static method
    }
    public  static void  m3()  // this method is public static method and its non overridden  method
            //if anyone can acces it they will get an error due to static method in interface
    {
        System.out.println("this is non over-ridden method of inteface  and we can not implemetnt it into another method");
    }
}

