package observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {

	List<Subscriber> subs = new ArrayList<>();
	String title;

	@Override
	public void subscribe(Subscriber s) {
		subs.add(s);
	}

	@Override
	public void unsubscribe(Observer s) {
		subs.remove(s);
	}

	@Override
	public void notifySubscriber() {
		for (Observer s : subs) {
			s.update();
		}
	}

	@Override
	public void upload(String title) {
		this.title = title;
		notifySubscriber();
	}

}
