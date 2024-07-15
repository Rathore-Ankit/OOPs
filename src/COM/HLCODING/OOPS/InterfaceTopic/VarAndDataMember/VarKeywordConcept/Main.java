package COM.HLCODING.OOPS.InterfaceTopic.VarAndDataMember.VarKeywordConcept;

public class Main {
    public static void main(String args [])
    {
        Test1 t1=new Test();
        //t1.m2(); //here we will get error because we cannot call another inteface method using our interface reference
        t1.m1();  // we can access our inteface all method passing our interface ref.

        Test2 t2 = new Test();
       // t2.m1();//here we will get error because we cannot call another inteface method using our interface reference
        // t2.m2();


        Test t3 = new Test(); // we can only call using both class implementing class ref
        t3.m1();
        t3.m2();


        // And java use another way to call two diff-diff method of diff-diff interfaces

    }

}
