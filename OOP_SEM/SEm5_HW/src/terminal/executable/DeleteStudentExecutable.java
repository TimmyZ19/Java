package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentExecutable implements CommandExecutable {

    private StudentService studentService;

    private Student student;

    public DeleteStudentExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }


    @Override
    public void execute() {
        studentService.deleteStudent(student);

    }
}
