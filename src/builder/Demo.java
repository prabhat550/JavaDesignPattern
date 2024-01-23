package builder;

public class Demo {

	public static void main(String[] args) {

		User user1 = new User.UserBuilder("Lokesh", "Gupta").age(30).phone("7575").address("Address 1").build();
		System.out.println(user1);

		User user2 = new User.UserBuilder("Jack", "Reacher").age(40).phone("5655").build();
		System.out.println(user2);

		User user3 = new User.UserBuilder("Super", "Man").build();
		System.out.println(user3);

	}

}
