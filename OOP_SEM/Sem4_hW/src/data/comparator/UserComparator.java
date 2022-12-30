package data.comparator;

import data.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User gs1, User gs2) {
        return gs1.getLastName().compareTo(gs2.getLastName());
    }
}
