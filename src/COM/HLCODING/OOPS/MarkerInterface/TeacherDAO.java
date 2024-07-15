package COM.HLCODING.OOPS.MarkerInterface;

public class TeacherDAO extends DAO{
    @Override
    public void delete(Object obj)
    {
        Teacher t= (Teacher) obj;
        if(t instanceof DeleteFile)
        {
            System.out.println("code for delete the table");
        }
        else
        {
            System.out.println("code for save the table");
        }

    }
}
