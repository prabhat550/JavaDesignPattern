package proxy;

public class Demo {

	public static void main(String[] args) {

		WebPageImpl webPageImpl = new WebPageImpl();
		WebPageProxy webPageProxy = new WebPageProxy(webPageImpl);
		try {
			webPageProxy.renderPage("www.google.com");
			webPageProxy.renderPage("www.youtube.com");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
