package service;

import data.Student;
import repository.StudentRepository;

public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public Student createUser(Student entity) {
        return null;
    }

    public Student saveStudent(Student entity) {
        studentRepository.save(entity);
        return entity;
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }


    public Student findStudentByFio(String fio) {
        return studentRepository.findByFio(fio);
    }

    public void deleteStudent(Student student) {
    }

    public Student deleteStudentFioAge(Student student, String fio, int age, int groupNumber) {
        return studentRepository.deleteStudentFioAge(student, fio, age, groupNumber);
    }


}
