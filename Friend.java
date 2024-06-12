public class Friend {

    String name;
    static int numberOffriends;

    Friend(String name) {
        this.name = name;
        numberOffriends++;
    }

    static void dispalyFriends() {
        System.out.println("you have " + numberOffriends + " friends");
    }

}
