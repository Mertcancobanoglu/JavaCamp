package business.concretes;

import business.abstracts.StudentService;
import entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentManager implements StudentService {
    private List<Student> students;


    public StudentManager() {
        students = new ArrayList<>();
        students.add(new Student("mertcan", "ç", 2000, "2", 1));
        students.add(new Student("ramazan", "ç", 350, "7", 1));
        students.add(new Student("murat", "ç", 35, "4", 1));
        students.add(new Student("seyfi", "ç", 30, "3", 1));
        students.add(new Student("ruşen", "ç", 50, "1", 1));
    }

    @Override
    public void add(Student newStudent) {
        for (Student student : students) {
            if (student.getStudentNo() == newStudent.getStudentNo()) ;
            System.out.println("Kayıtlı kullanıcı");
            return;
        }
        students.add(newStudent);
    }

    @Override
    public void delete(int id) {
        for (Student student : students) {
            if (student.getStudentNo() == id) {
                students.remove(student);
            }
        }
    }

    @Override
    public void update(int id, Student newStudent) {
        for (Student student : students) {
            if (newStudent.getStudentNo() == id) {
                student.setStudentNo(newStudent.getStudentNo());
                student.setFirstName(newStudent.getFirstName());
                student.setGroup(newStudent.getGroup());
                student.setLatName(newStudent.getLatName());
                student.setNationalityId(newStudent.getNationalityId());
            }
        }
    }

    @Override
    public List<Student> getAll() {
        return students;
    }
}
