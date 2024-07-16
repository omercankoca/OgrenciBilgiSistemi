import java.awt.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course history = new Course("History", "HST101", "HST");
        Course mat = new Course("Math", "MAT101", "MAT");
        Course physics = new Course("Physics", "PHY101", "PHY");

        Teacher t1 = new Teacher("Mahmut teacher", "555", "HST");
        Teacher t2 = new Teacher("Ayşe teacher", "567", "PHY");
        Teacher t3 = new Teacher("Kemal teacher", "543", "MAT");

        mat.addTeacher(t3);
        history.addTeacher(t1);
        physics.addTeacher(t2);

        Student s1 = new Student("Ömer", "1520", 3, history,mat,physics);
        s1.addBulkExamNote(25,75,65);
        s1.isPass();
        Student s2 = new Student("Kemal", "2575", 3, history,mat,physics);
        s2.addBulkExamNote(45,15,35);
        s2.isPass();
        Student s3 = new Student("Mehmet", "4565", 3, history,mat,physics);
        s3.addBulkExamNote(72,62,70);
        s3.isPass();
    }
}