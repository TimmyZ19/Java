package service;

import data.StudentGroup;
import data.User;

public interface DataService<U extends User> {
    StudentGroup getGroup();

    StudentGroup getGroup(int number);

    void removeStudent(String firstName, String lastName);

    void sortUsers(StudentGroup studentGroup);

    void sortUsersByName(StudentGroup studentGroup);
}
