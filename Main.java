public class Main {

    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        // the class "owns" the static member

        Friend friend1 = new Friend("freedus");
        Friend friend2 = new Friend("BRO");

        System.out.println(Friend.numberOffriends);

        Friend.dispalyFriends();

    }
}