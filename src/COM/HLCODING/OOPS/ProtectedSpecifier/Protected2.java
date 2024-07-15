package COM.HLCODING.OOPS.ProtectedSpecifier;

public class Protected2{
    public static void main(String[] args) {
        Protected2 obj = new Protected2();
       obj.proAccess();
        Protected1 p2= new Protected1();
        p2.protected1Method();

    }

    protected void proAccess()
    {
        Protected1 p2= new Protected1();
        p2.protected1Method(); // we can use protected method with in a package using obj without extends child parent
        // and outside the package only the
    }
}
