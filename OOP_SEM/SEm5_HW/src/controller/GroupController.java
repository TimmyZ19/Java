package controller;

import data.StudentGroup;

public class GroupController extends Controller<StudentGroup, Integer> {
    public GroupController(StudentGroupServiceimplement studentGroupServiceimplement) {
        super(studentGroupServiceimplement);
    }

    public StudentGroup saveStudentGroup(StudentGroup entity) {
        return null;
    }


    public StudentGroup findStudentGroupById(Integer id) {
        return null;
    }

    public StudentGroup findStudentGroupByFio(String fio) {
        return null;
    }
}
