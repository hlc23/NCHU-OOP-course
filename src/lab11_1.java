import java.util.*;

class FriendManager {
	Set<String> f;

  public FriendManager() {
    this.f = new HashSet<String>();
  }

  public void addFriend(String friend) {
    this.f.add(friend);
  }

  public void removeFriend(String friend) {
    if (this.f.contains(friend)) this.f.remove(friend);
  }

  public Set<String> getFriends() {
    return this.f;
  }

  public int getFriendCount() {
    return this.f.size();
  }

  public boolean hasFriend(String friend) {
    return this.f.contains(friend);
  }
}
public class Main {
    public static void main(String[] args) {
        FriendManager manager = new FriendManager();

        manager.addFriend("Alice");
        manager.addFriend("Bob");
        manager.addFriend("Charlie");

        System.out.println(manager.getFriends()); // Should print: [Alice, Bob, Charlie]
        System.out.println(manager.getFriendCount()); // Should print: 3
        System.out.println(manager.hasFriend("Alice")); // Should print: true
        System.out.println(manager.hasFriend("David")); // Should print: false

        manager.removeFriend("Alice");

        System.out.println(manager.getFriends()); // Should print: [Bob, Charlie]
    }
}