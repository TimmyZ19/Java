/*
- Модифицировать класс StudentGroup, заставив его реализовать интерфейс Iterable<Student>
- Реализовать метод iterator() возвращающий экземпляр созданного нами итератора

- Модифицировать класс StudentGroupServiceImpl, добавив в него метод удаления студента по ФИО
- Модифицировать класс Controller, добавив в него метод удаления студента и вызывать в нем
   созданный метод из StudentGroupServiceImpl
 */


package data;

import data.Iterator.StudentGroupIterator;

import java.util.Iterator;
import java.util.List;


public class StudentGroup {

    private Teacher teacher;

    private List<Student> studentList;

    private int groupNumber;


    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public StudentGroup(Teacher teacher, List<Student> studentList, int groupNumber) {
        this(teacher, studentList);
        this.groupNumber = groupNumber;
    }


    public StudentGroup() {

    }

    public StudentGroup(int number) {
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    //@Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }


}
