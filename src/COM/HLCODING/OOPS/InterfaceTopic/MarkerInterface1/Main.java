package COM.HLCODING.OOPS.InterfaceTopic.MarkerInterface1;

import COM.HLCODING.OOPS.MarkerInterface.Teacher;

public class Main {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setId("1234");

        Teacher t1 = new Teacher();
        t1.setId(1431);


        DAO d1 = new StudentDAO();
        d1.delete(s1);

        DAO d2 = new TeacherDAO();
        d2.delete(t1);



    }


}
