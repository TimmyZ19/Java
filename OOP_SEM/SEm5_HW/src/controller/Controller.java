package controller;

import data.GroupStream;
import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.comparators.GroupStreamComparator;
import service.DataService;

import java.util.Collections;
import java.util.List;

public class Controller<T, I> {

    private DataService studentServiceimplement;                                        // создали переменную
    private DataService teacherServiceimplement;                                       // создали переменную

    private DataService studentGroupServiceimplement;

    private DataService groupNumber;

    public Controller(DataService studentServiceimplement, DataService teacherServiceimplement, DataService studentGroupServiceimplement, DataService groupNumber) {
        this.studentServiceimplement = studentServiceimplement;
        this.teacherServiceimplement = teacherServiceimplement;
        this.studentGroupServiceimplement = studentGroupServiceimplement;
        this.groupNumber = groupNumber;
    }

    public Controller(StudentServiceimplement studentServiceimplement) {
        this.studentServiceimplement = studentServiceimplement;                       // инициализировали student
    }

    public Controller(TeacherServiceImplement teacherServiceImplement) {
        this.teacherServiceimplement = teacherServiceImplement;                       // инициализировали teacher
    }

    public Controller(StudentGroupServiceimplement studentGroupServiceimplement) {
        this.studentGroupServiceimplement = studentGroupServiceimplement;                 // инициализировали StudentGr
    }


    public Student createStudent(Student student) {
        studentServiceimplement.create(student);
        return (Student) studentServiceimplement.read(student);

    }

    public Teacher createTeacher(Teacher teacher) {
        teacherServiceimplement.create(teacher);
        return (Teacher) teacherServiceimplement.read(teacher);

    }

    public StudentGroup createTeacher(StudentGroup studentGroup) {
        studentGroupServiceimplement.create(studentGroup);
        return (StudentGroup) studentGroupServiceimplement.read(studentGroup);

    }

    public StudentGroup createGroup(int groupNumber) {
        return (StudentGroup) studentGroupServiceimplement.createGroups(groupNumber);

    }

    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }


    public Teacher saveTeacher(Teacher entity) {
        return null;
    }


    public Teacher findTeacherById(Integer id) {
        return null;
    }

    public Teacher findTeacherByFio(String fio) {
        return null;
    }


}
