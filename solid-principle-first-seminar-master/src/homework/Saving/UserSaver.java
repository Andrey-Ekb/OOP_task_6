package homework.Saving;

import homework.User.User;

public class UserSaver implements Savable {
    public UserSaver(){
        
    }

    public void saveUser(User user) {
        System.out.println("Save user: id " + user.getId() + "  Name " + user.getName());
    }
}