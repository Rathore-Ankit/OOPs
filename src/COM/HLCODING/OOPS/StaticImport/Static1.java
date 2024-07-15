package COM.HLCODING.OOPS.StaticImport;

//import COM.HLCODING.OOPS.StaticExample.StaticMethods;
//instead of thet we will use static import for all the static method
//static import statement
import static COM.HLCODING.OOPS.StaticExample.StaticMethods.*;

public class Static1 {
    public static void AccessStaticMethod()
    {
//        StaticMethods.m1();
//        StaticMethods.m2();
//        StaticMethods.m3();
//        StaticMethods.m4();
        //if i want to call more static methods so i have to write class.method name agian and again
        // so to resolve it i will use static import

        //now there is no need to write class.method name simply write static method name
        // class will be load at the time of method calling
        m1();
        m2();
        m3();
    }

}
