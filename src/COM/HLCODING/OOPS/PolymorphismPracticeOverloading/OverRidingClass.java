package COM.HLCODING.OOPS.PolymorphismPracticeOverloading;
//here we are discussing about the polymorphism

//We can achieve Polymorphism using three ways :
// 1 . Class Base Polymorphism : Mehtod overloading / Method overriding
// 2. Abstract class base polymorphism
// 3. Interface based Polymorphism

//This is am example of Class based method overloading polymorphism
public class OverRidingClass {
    public void M1()
    {
        System.out.println("here we are doing method overriding");
    }
    public int M1(int x,int y)
    {
        return x+y;

    }

    public void M1(String name)
    {
        System.out.println("your name is : "+ name);
    }

    public void M1( float salary)
    {
        System.out.println("your salry is : "+salary);
    }

    public void main ( String Age)
    {
        System.out.println("your Age is : "+Age);
    }
    //here we can also overload the main method by changing their parameter

    public static void main ( String args [])
    {
        OverRidingClass a1 = new OverRidingClass();

        a1.M1();
        a1.M1("ankit");
        a1.main("22"); // here we are overloading main method as well
        //so we can do overriding with in a class
        //Parameter must be different of all methods for achieve overloading
        // it is also known as compile time polymorphism / static polymorphism /method overriding / early binding
        //and it is use to increase the readability of a class
    }

}
