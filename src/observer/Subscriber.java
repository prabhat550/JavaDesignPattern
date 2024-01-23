package observer;

public class Subscriber implements Observer {

	private String name;
	private Subject channel = new Channel();

	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		System.out.println("Hey " + name + " Video Uploaded ");
	}

	@Override
	public void subscribeChannel(Subject ch) {
		this.channel = ch;

	}

}
