package COM.HLCODING.OOPS.InterfaceTopic;

public interface Vehivle {

    public abstract void start ();
}

// we have interface which have type of blueprint for the start method


class Baleno implements Vehivle{
    public void start ()
    {
        //here baleno class implement the vehicle class start method functionality
        System.out.println("baleno start method called");
    }
}

class main
{
    Vehivle v = null;

    public void display ()
    {
        v = getVehicle();
        v.start();
    }
    public Vehivle getVehicle() {
        if (v != null) {

        } else {
            v = new Baleno();
        }
        return null;
    }
    public void setVehicle(Vehivle v)
    {
        this.v=v;
    }
    public static void main(String[] args) {
        main obj = new main();
        obj.getVehicle();

    }
}