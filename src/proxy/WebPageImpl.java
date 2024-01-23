package proxy;

public class WebPageImpl implements WebPage {

	@Override
	public void renderPage(String url) {
		System.out.println("The web page " + url + " is rendered.");
	}

}
