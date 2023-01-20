/*
  №1
- Создать пекедж repository. Дальнейшие работы ведем в нем
- Реализовать в нем интерфейс Repository<E,I>
- Задать в созданном интерфейсе 2 абстрактных метода:
  E save(E entity)
  E findById (I id)
- Создать класс GroupRepository, имплементировав его от Repository

  №2
- Создать класс GroupRepository имплементировав его от Repository<Group, Integer>
- В классе StudentGroupServiceImpl добавить новую переменную Repository<Group, Integer>
- В классе StudentGroupServiceImpl реализовать методы сохранения
  группы и поиска её по номеру

  #3
- Создать интерфейс UserRepository<U extends User,I> унаследовав его
  от Repository<E, I>
- В интерфейс UserRepository<E,I> задать абстрактный метод E findByFio (String fio)
- Создать класc StudentRepository имплементировав интерфейс UserRepository

  #4
- Создать класc StudentRepository имплементировав интерфейс
  UserRepository <Student, Integer>
- В классе StudentService добавить новую переменную StudentRepository
- В классе StudentService реализовать методы сохранения студента и его
  поиска по id и ФИО.

 */

package repository;

public interface Repository<E, I> {

    E save(E entity);

    E findById(I id);

}
