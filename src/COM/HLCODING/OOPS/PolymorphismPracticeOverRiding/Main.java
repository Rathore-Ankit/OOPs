package COM.HLCODING.OOPS.PolymorphismPracticeOverRiding;

public class Main {
    public static void main(String[] args) {
//        Connection c1          =    new Connection();// it will call parent class connection method
//        // parent reference//       // parent class object//
//        c1.connection();
//
//        Connection c2          =    new MYSQL();// it will call child mysql class connection method
//        // parent reference//       // Child MYSQL CLASS Object //
//        c2.connection();
//
//        Connection c3          =    new MongoDB();// it will call child MongoDB class connection method
//        // parent reference//       // Child MongoDB CLASS Object//
//        c3.connection();
//
//        //So using method overriding we can call its specific child class same name method
//        //by passing the child class object , We should always pass parent class refrence

        //we can also give parent ref and parent red but always it will call parent overridden method
        //and there is no sense for doing method overrding


        Connection c3          =    new MongoDB();// it will call child MongoDB class connection method
        // parent reference//       // Child MongoDB CLASS Object//
        c3.connection();




        //This is called Runtime Polymorphism / Dynamic Polymorphism / late Binding and Methof overriding
        //For Method overriding we have to pass same method name with same parameter into another class
        //we cannot override main method becasue this is static and class leval declaration method
        //Note for Achieve polymorphism we have two pass parent class ref and child class object
        //And it is use to provide specific implementation of a Method which os already there in the parent class

    }
}
