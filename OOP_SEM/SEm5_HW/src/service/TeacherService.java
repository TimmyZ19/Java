package service;

import data.Teacher;
import repository.TeacherRepository;

public class TeacherService {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher createUser(Teacher entity) {
        return null;
    }

    public Teacher saveTeacher(Teacher entity) {
        teacherRepository.save(entity);
        return entity;
    }


    public Teacher findTeacherById(int id) {
        return teacherRepository.findById(id);
    }

    public Teacher findTeacherByFio(String fio) {
        return teacherRepository.findByFio("fio");
    }


}
