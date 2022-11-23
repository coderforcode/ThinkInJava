import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        Map<User, Object> map = new TreeMap<>();
        map.put(new User("小红"), new Object());
        map.put(new User("小明"), new Object());
        map.put(new User("小王"), new Object());
        System.out.println(map);
    }
}

class User implements Comparable<User> {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}

