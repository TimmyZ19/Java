package controller;

import data.Teacher;
import service.TeacherService;

public class TeacherController extends Controller<Teacher, Integer> {

    private TeacherService teacherService;

    public TeacherController(TeacherServiceImplement teacherServiceImplement) {
        super(teacherServiceImplement);
    }

    public Teacher create(Teacher entity) {
        return teacherService.createUser(entity);
    }

    public Teacher saveTeacher(Teacher entity) {
        return teacherService.saveTeacher(entity);
    }

    public Teacher findTeacherById(Integer id) {
        return teacherService.findTeacherById(id);
    }

    public Teacher findTeacherByFio(String fio) {
        return teacherService.findTeacherByFio("fio");
    }
}
