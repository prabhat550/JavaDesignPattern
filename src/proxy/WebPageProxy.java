package proxy;

public class WebPageProxy implements WebPage{
	
	private WebPage webPage;
	
	public WebPageProxy(WebPage webPage) {
		this.webPage = webPage;
	}
	
	@Override
	public void renderPage(String url) throws Exception {
		if(url.equalsIgnoreCase("www.youtube.com")) {
			throw new Exception("Invalid URL");
		} else {
			webPage.renderPage(url);
		}
	}

}
