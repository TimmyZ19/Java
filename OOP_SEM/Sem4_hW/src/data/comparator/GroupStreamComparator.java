package data.comparator;

import data.GroupStream;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare(GroupStream gs1, GroupStream gs2) {
        int groupStreamSize1=gs1.getStudentGroup().size();
        int groupStreamSize2=gs2.getStudentGroup().size();
        return Integer.compare(groupStreamSize1, groupStreamSize2);
    }
}
