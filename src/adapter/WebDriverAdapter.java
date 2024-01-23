package adapter;

public class WebDriverAdapter implements WebDriver {

	IEDriver ieDriver;

	WebDriverAdapter(IEDriver ieDriver) {
		this.ieDriver = ieDriver;
	}

	@Override
	public void getElement() {
		ieDriver.findElement();
	}

	@Override
	public void selectElement() {
		ieDriver.clickElement();
	}

}
