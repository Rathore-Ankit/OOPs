package COM.HLCODING.OOPS.Encapsulation;

public class Demo1 {
    private String name;
    private String roll_no;
    private int id;

    public Demo1(String roll_no) // this is a constructor
    {
        this.roll_no=roll_no;
    }

    public String getRoll_no() //this is getter method
    {
        return roll_no;
    }

    public void setName(String name)
    {
        this.name= name;
    }

    public void setId(int id)
    {
        this.id= id;
    }
    public String getName() //this is getter method
    {
        return name;
    }
    public int getId() //this is getter method
    {
        return id;
    }




}
