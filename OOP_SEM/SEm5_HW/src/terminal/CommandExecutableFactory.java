package terminal;

import data.Student;
import service.StudentService;
import terminal.executable.CommandExecutable;
import terminal.executable.CreateStudentExecutable;
import terminal.executable.DeleteStudentExecutable;
import terminal.executable.DeleteStudentExecutableFioAge;

public class CommandExecutableFactory {

    private StudentService studentService;
    private StudentService studentFio;
    private String fio;
    private int age;
    private int groupNumber;

    public CommandExecutable create(String[] input) {

        if (input[0].equals("/add")) {
            return new CreateStudentExecutable(
                    studentService, new Student(input[1]));
        }
        if (input[0].equals("/dell")) {
            return new DeleteStudentExecutable(studentService, new Student(input[1]));
        }
        if (input[0].equals("/dellfio")) {
            return new DeleteStudentExecutableFioAge(studentService, new Student(input[1]), fio, age, groupNumber);
        }
        return null;

    }


}
