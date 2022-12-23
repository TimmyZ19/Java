package controller;

import data.StudentGroup;
import service.DataService;

public class Controller {
    private DataService groupService;

    public Controller(DataService groupService) {
        this.groupService = groupService;
    }

    public StudentGroup createGroup(int groupNumber) {
        return groupService.getGroup(groupNumber);
    }
}
