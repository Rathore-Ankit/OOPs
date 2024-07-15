package COM.HLCODING.OOPS.PolymorphismPracticeOverRiding;

public class MYSQL extends Connection {
    public  void  connection ()
    {
        System.out.println("this is Child MYSQL class connection");
    }
    public void saveData()
    {
        System.out.println("this is Child MYSQL class save method");
    }
}
