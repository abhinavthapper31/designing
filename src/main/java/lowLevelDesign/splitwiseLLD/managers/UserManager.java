package lowLevelDesign.splitwiseLLD.managers;

import lowLevelDesign.splitwiseLLD.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager {

    List<User> users;

    UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public User getUser(Integer userID) {

        for (User user : users) {
            if (user.getId() == userID) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return users;
    }

}
