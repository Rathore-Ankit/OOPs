package COM.HLCODING.OOPS.MarkerInterface;

public class StudentDAO extends DAO {
    public void delete(Object obj) {
        Student  s = (Student) obj; // we are doing typecasting
        if (s instanceof DeleteFile) {
            System.out.println("code for delete the table");
            //code for delete the table
        }
        else{
            System.out.println("code for save the table");
            //code for save  the table
        }
    }
}
