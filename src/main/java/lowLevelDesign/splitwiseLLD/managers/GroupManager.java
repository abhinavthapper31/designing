package lowLevelDesign.splitwiseLLD.managers;

import lowLevelDesign.splitwiseLLD.models.Group;
import lowLevelDesign.splitwiseLLD.models.User;

import java.util.ArrayList;
import java.util.List;

public class GroupManager {

    List<Group> groups;

    public GroupManager() {
        this.groups = new ArrayList<>();
    }

    public void createANewGroup(String name, Integer id, User createdBy) {
        Group group = new Group();
        group.setGroupId(id);
        group.setGroupName(name);
        group.getMembers().add(createdBy);
        this.groups.add(group);
    }

    public Group getGroupById(Integer id) {
        return groups.stream().filter(group -> group.getGroupId() == id).findFirst().orElse(null);
    }

    public void addMemberToGroup(Integer id, User user) {
        Group group = getGroupById(id);
        group.getMembers().add(user);
    }

}
