package service;

import data.GroupStream;
import data.comparator.GroupStreamComparator;

import java.util.List;
import java.util.Collections;

public class GroupStreamServiceImpl implements StreamService {
    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}