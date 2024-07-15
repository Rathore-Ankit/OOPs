//Marker interface practice
package COM.HLCODING.OOPS.MarkerInterface;

public class main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);

        DAO d1 = new StudentDAO();
        d1.delete(s1);

        Teacher t1 = new Teacher();
        DAO d2 = new TeacherDAO();
        d2.delete(t1);
        //teacher class is not implement the deletefile interface and that's the reson it will never give acces for delete the table
    }
}
