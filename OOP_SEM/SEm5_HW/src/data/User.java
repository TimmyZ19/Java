package data;

/*
  Создать package – data. Работу продолжаем в нем
  Реализовать абстрактный класс User и его наследники Student и Teacher.
  Родитель имеет в себе общие данные (фио, год рождения, паспорт (серия номер),
  а наследники собственные параметры (номер группы для Student, кафедра для Teacher).
 */


public abstract class User {
    private String fio;
    private int age;
    private int pass;

    public User(String fio, int age, int pass) {
        this.fio = fio;
        this.age = age;
        this.pass = pass;
    }

    public User(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
