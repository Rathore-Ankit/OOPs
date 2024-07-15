package COM.HLCODING.OOPS.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Demo1 d1 = new Demo1("1234");
        String roll=d1.getRoll_no();
        setValue(d1);
    }

    public static void  setValue(Demo1 d1)
    {
        d1.setId(101);
        int id =d1.getId();
        System.out.println(id);

        d1.setName("ankit");
        String name=d1.getName();
        System.out.println(name);



    }

}
