import java.io.Serializable;

class User implements Serializable {
    private String username;
    private transient String password; // This field will not be serialized

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{username='" + username + "', password='" + password + "'}";
    }
}