package data;

//номер группы для Student
public class Student extends User {
    private int groupNumber;

    public Student(String fio, int age, int pass, int groupNumber) {
        super(fio, age, pass);
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int compareTo(Student student) {
        if (student.getAge() < this.getAge())
            return 1;
        if (student.getAge() > this.getAge())
            return -1;
        return 0;
    }

    public Student(String fio) {
        super(fio);
    }
}
