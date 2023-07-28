package homework.User;

public class User extends Someone {
    public Long id;
    public String name;

    public User(Long id, String name) {
        this.id=id;
        this.name=name;
    }

    public Long getId() {return id;}

    public String getName() {return name;}

    @Override
    public String toString() {
        return String.format("%d,  %s", id, name);
    }
}
