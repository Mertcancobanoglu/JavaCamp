import business.concretes.StudentManager;
import entities.Student;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        System.out.println(studentManager.getAll().get(3).getFirstName());
        studentManager.add(new Student("mertcan", "asas", 222, "222", 1));
        System.out.println(studentManager.getAll().get(4).getFirstName());
        studentManager.add(new Student("asdasd", "dsadad", 333, "333", 1));
        System.out.println(studentManager.getAll().get(4).getFirstName());
        studentManager.update(123, new Student("deneme", "asd", 111, "111", 1));
        System.out.println(studentManager.getAll().get(4).getFirstName());
        studentManager.delete(123);
        System.out.println(studentManager.getAll().get(3).getFirstName());

        for (Student student : studentManager.getAll()) {
            System.out.println("---");
            System.out.println(student.getStudentNo());
            System.out.println(student.getFirstName());
            System.out.println(student.getLatName());
            System.out.println(student.getNationalityId());
            System.out.println(student.getGroup());
        }

    }
}