package data;

//кафедра для Teacher
public class Teacher extends User {
    private String kafedra;

    public Teacher(String fio, int age, int pass, String kafedra) {
        super(fio, age, pass);
        this.kafedra = kafedra;
    }
}
