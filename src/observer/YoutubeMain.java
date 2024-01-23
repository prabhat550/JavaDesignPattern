package observer;

public class YoutubeMain {

	public static void main(String[] args) {
		
		Subject myChannel = new Channel();
		
		Subscriber s1 = new Subscriber("Akhil");
		Subscriber s2 = new Subscriber("Sonam");
		
		myChannel.subscribe(s1);
		myChannel.subscribe(s2);
		
		s1.subscribeChannel(myChannel);
		s2.subscribeChannel(myChannel);
		
		myChannel.upload("New Movie");
	
		

	}

}
