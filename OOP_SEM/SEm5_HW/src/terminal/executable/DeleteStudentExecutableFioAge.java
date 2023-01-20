package terminal.executable;

import data.Student;
import service.StudentService;

public class DeleteStudentExecutableFioAge implements CommandExecutable {

    private StudentService studentService;
    private String fio;
    private int age;
    private int groupNumber;
    private Student student;


    public DeleteStudentExecutableFioAge(StudentService studentService, Student student, String fio, int age, int groupNumber) {
        this.studentService = studentService;
        this.student = student;
        this.fio = fio;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    @Override
    public void execute() {
        studentService.deleteStudentFioAge(student, fio, age, groupNumber);

    }

}
