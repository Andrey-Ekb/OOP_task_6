package homework.Reporting;

import homework.User.User;

public class UserReporter implements Reportable {
     
    public UserReporter(){}

    public void reportUser(User user) {
        System.out.println("Report for user: id " + user.getId() + "  Name " + user.getName());
    }
}
