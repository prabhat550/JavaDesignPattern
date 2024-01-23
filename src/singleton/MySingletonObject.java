package singleton;

public class MySingletonObject {

	private static volatile MySingletonObject instance;

	private MySingletonObject() {
	}

	public static MySingletonObject getInstance() {
		if (instance == null) {
			synchronized (MySingletonObject.class) {
				if (instance == null) {
					instance = new MySingletonObject();
				}
			}
		}
		return instance;
	}

}
