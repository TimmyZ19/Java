package terminal.executable;

import data.Student;
import service.StudentService;

public class CreateStudentExecutable implements CommandExecutable {

    private StudentService studentService;

    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }


    @Override
    public void execute() {
        studentService.saveStudent(student);
    }
}
