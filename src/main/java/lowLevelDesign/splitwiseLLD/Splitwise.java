package lowLevelDesign.splitwiseLLD;

import lowLevelDesign.splitwiseLLD.managers.GroupManager;
import lowLevelDesign.splitwiseLLD.managers.UserManager;

public class Splitwise {

    UserManager userManager;
    GroupManager groupManager;

    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public GroupManager getGroupManager() {
        return groupManager;
    }

    public void setGroupManager(GroupManager groupManager) {
        this.groupManager = groupManager;
    }

    public void addExpense(){

    }
}
