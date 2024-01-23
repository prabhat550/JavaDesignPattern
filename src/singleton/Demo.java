package singleton;

public class Demo {

	public static void main(String[] args) {

		MySingletonObject mySingletonObject_1 = MySingletonObject.getInstance();
		System.out.println(mySingletonObject_1.hashCode());

		MySingletonObject mySingletonObject_2 = MySingletonObject.getInstance();
		System.out.println(mySingletonObject_2.hashCode());

	}

}
