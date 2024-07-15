package COM.HLCODING.OOPS.AccesSpecifier;


import COM.HLCODING.OOPS.PrivateSpecifier.Private1; //this is privatespecifier package


import COM.HLCODING.OOPS.PublicSpecifier.Public1;////this is public specifier package
//public specifier



//THIS IS protected package import statement
import COM.HLCODING.OOPS.ProtectedSpecifier.Protected2;
// if we acces this one without import the package we will get an error
public class TestSpecifier extends Protected2 {
    //test specifier is child method of protected2
    //and only child class obj can acces the parent class protected method
    public static void main(String[] args) {
        Public1.m1();
       TestSpecifier t1 = new TestSpecifier();
       t1.proAccess();
        // because proteced method accesable with in the package and its inhrtitaed package
        // we have to explicityly add the import package in its inherited class








    }
    // two ways to acces the non- static methods
    //1st extends the parent class and acces it directly writing name in not static method
    //2nd provide the memory using object and acces it using object
    public void publicAccess() {
        //1st way to extends the parent class into different package
       //m2();


        //2nd way to provide the memory and access it using object
        Public1 p1 = new Public1();
        p1.m2();

        //we can acces public specifier anywhere using import only
        //it public acces anywhere

        //if method static using import package only and class.method name

        //if method non static 1st extends the class or using object

    }


    //private specifier
// if we declare any method as a priavate so we can acces it with in a class only
 public void priavteAccess()
 {
//     Private1.p1();   // Here we cant acces it due to private method

     // Means we can access the private method only in its class instead of another class of same package or
     // another class of another package
 }


 //default access specifier


    public void DefAccess()
    {
//        DefMethod();
        //ouside the package we can't access the default method
        // we can only access it in with in the package
    }


 //protected access specifier




    }










//public void ProtectedAccess()
//        {
//        //protected only can used by its child class object
//
//
//        Protected1 pr1 = new Protected1();
//        pr1.p3();
//
//// we get an error because parent can't acces it's own protected method
//
//
////We can access the parent class protected method using its
////child class object only
//
