package COM.HLCODING.OOPS.InterfaceTopic.MarkerInterface1;

import COM.HLCODING.OOPS.InterfaceTopic.MarkerInterface1.DeleteFile;

public class student implements DeleteFile {

    private String id;
    public void setId(String id)
    {
        this.id=id;
    }

    public String  getId()
    {
        return id;
    }
}
