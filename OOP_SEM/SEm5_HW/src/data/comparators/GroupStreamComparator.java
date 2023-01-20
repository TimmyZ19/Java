package data.comparators;

import data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare(GroupStream o1, GroupStream o2) {
        int num1 = o1.getStudentGroup().size();
        int num2 = o2.getStudentGroup().size();
        return Integer.compare(num1, num2);
    }

}
