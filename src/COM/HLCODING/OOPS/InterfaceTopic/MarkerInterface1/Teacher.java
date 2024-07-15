package COM.HLCODING.OOPS.InterfaceTopic.MarkerInterface1;

import COM.HLCODING.OOPS.InterfaceTopic.MarkerInterface1.DeleteFile;

public class Teacher implements DeleteFile {
    private String name;
    public void setName(String name)
    {
        this.name=name;
    }

    public String  getId()
    {
        return name;
    }
}
