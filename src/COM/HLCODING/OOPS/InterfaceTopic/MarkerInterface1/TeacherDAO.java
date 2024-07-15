package COM.HLCODING.OOPS.InterfaceTopic.MarkerInterface1;

import COM.HLCODING.OOPS.InterfaceTopic.MarkerInterface1.DAO;
import COM.HLCODING.OOPS.InterfaceTopic.MarkerInterface1.DeleteFile;
import COM.HLCODING.OOPS.MarkerInterface.Teacher;

public class TeacherDAO extends DAO {
    public void delete(Object obj) {
        //write the code for the delete the table
        // now we will do typecasting
        Teacher t1 = (Teacher) obj;

        if (t1 instanceof DeleteFile) {
            System.out.println("delete the table");
        } else {
            System.out.println("not delete the table");
        }
    }
}
