package COM.HLCODING.OOPS.Overriding;

public class Main {
    public static void  main ( String args [])
    {
        Parent p1 = new Parent(); //parnet object parent ref // memory-> m1 , m2 method
        Child1 c1 = new Child1(); //child object child ref // memory -> m1,m2,m3,m4

        //Child1 c2 = new Parent(); // it will thrown compile time error because there is no chance to provide
        //child method referance and parent method memory

        //most usable case in overriding

        Parent p2 = new Child1();  //parent object child referance //memory  -->  m1, m2,m3,m4
        //means everytime we need to give acces to the parent class because one parent have multiple child classes
        //
        p2.m1();  //here m1 override and calling child class m1 instead of parent m1 due to
        p1.m1(); //it will call parent m1 method
        Child1.m3();


        //if
        Parent p3 = new Child2();
        p3.m1();



    }
}
