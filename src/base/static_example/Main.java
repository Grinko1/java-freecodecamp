package base.static_example;

public class Main {
    public static void main(String[] args) {
        Friend anna = new Friend("Anna");
        Friend anna2 = new Friend("Anna");
        System.out.println(Friend.count);
        Friend.displayFriends();

    }
}
