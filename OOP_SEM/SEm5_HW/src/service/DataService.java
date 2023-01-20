package service;

import data.StudentGroup;
import data.User;

public interface DataService<T extends User> {

    void create(User user);

    User read(User user);

    void create(StudentGroup studentGroup);

    StudentGroup read(StudentGroup studentGroup);

    StudentGroup createGroups(int studentGroup);

    //void createGroups (StudentGroup studentGroup);

}
