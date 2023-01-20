package service;

import data.GroupStream;
import data.comparators.GroupStreamComparator;

import java.util.Collections;
import java.util.List;

public class GroupStreamServiceImpl extends GroupStreamService {
    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}
