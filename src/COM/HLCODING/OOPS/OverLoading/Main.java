package COM.HLCODING.OOPS.OverLoading;

public class Main {
// here we are doing method over loading
    //it is also known as compile time polymorphism or static/earlybinding polymorphism

    public void Add()
    {
//        int x =sum();
//        System.out.println(x);
//        String result=  sum("ankit"," rathore");
//        System.out.println(result);
    }

    public static void main(String[] args) {
       Main m1= new Main();
       m1.Add();

       Addition a1 = new Addition();
       a1.sum(2,4);

    }

}
