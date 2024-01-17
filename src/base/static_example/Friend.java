package base.static_example;

public class Friend {
    String name;
    static int count;

    public Friend(String name) {
        this.name = name;
        count++;
    }
    static void displayFriends(){
        System.out.println("You have " + count + " friends");
    }
}
