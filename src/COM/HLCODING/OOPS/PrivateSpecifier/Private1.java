package COM.HLCODING.OOPS.PrivateSpecifier;
import COM.HLCODING.OOPS.ProtectedSpecifier.Protected1;
import COM.HLCODING.OOPS.PublicSpecifier.Public1;

public class Private1{
//private specifier
// if we declare any method as a priavate so we can acces it with in a class only
        //EX-

        private  void p1()
        {
            System.out.println("this is private method");
        }

        public void p2()
        {
            p1();// we can call it private method with in class
            //if i will use p1 into another class it will throw an error
        }

    // Means we can access the private method only in its class instead of another class of same package or
    // another class of another package


    public void AccesProtectedMethod(){
            Protected1 p = new Protected1();
           // p.protected1Method; //errror
            //here we can't acces the protected method when we import the packgae of protected method
        //beacuse only its child class can acces it property using obj and no one can
    }
}
