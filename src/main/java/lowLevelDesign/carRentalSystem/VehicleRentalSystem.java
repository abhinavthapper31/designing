package lowLevelDesign.carRentalSystem;

import lowLevelDesign.carRentalSystem.models.Location;
import lowLevelDesign.carRentalSystem.models.Store;
import lowLevelDesign.carRentalSystem.models.User;

import java.util.List;

public class VehicleRentalSystem {

    private List<Store> storeList;
    private List<User> userList;

    VehicleRentalSystem(List<Store> stores, List<User> users) {

        this.storeList = stores;
        this.userList = users;
    }


    public Store getStore(Location location) {
        return storeList.get(0);
    }

    public List<Store> getStoreList() {
        return storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User findUser(User inputUser) {
        User userFound =  userList.stream().filter(user -> user.getName().equalsIgnoreCase(inputUser.getName())).findFirst().orElse(null) ;
        System.out.println("User found with name " + userFound.getName());
        return userFound;
    }

    public Store findStore(Location location) {
        Store storeFound =  storeList.stream().filter(store -> store.getLocation().getLocationId().equals(location.getLocationId())  ).findFirst().orElse(null) ;
        System.out.println("Store found with " + storeFound.getStoreId());
        return storeFound;

    }
}
