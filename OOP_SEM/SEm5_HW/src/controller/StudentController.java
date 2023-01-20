package controller;

import data.Student;
import service.StudentService;

public class StudentController extends Controller<Student, Integer> {

    private StudentService studentService;

    public StudentController(StudentServiceimplement studentServiceimplement) {
        super(studentServiceimplement);
    }


    public Student create(Student entity) {
        return studentService.createUser(entity);
    }

    public Student saveStudent(Student entity) {
        return studentService.saveStudent(entity);
    }

    public Student findStudentById(Integer id) {
        return studentService.findStudentById(id);
    }


    public Student findStudentByFio(String fio) {
        return studentService.findStudentByFio("fio");
    }
}
