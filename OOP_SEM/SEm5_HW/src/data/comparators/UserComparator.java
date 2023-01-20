/*
 - создать класс UserComporator рефлизующий интерфейс
   Comporator<User>;
 - Рефлизовать контракт compareTo() со сравнением по ФИО
 - Модифицировать класс StudentGroupServiceImpl, добавив
   в него метод сортировки списка студетов по ФИО
 */


package data.comparators;

import data.Student;

import java.util.Comparator;

public class UserComparator implements Comparator<Student> {


    @Override
    public int compare(Student student1, Student student2) {

        return (student1.getFio().compareTo(student2.getFio()));
    }


}
