package factory;

public class AWS implements CloudPlatform {

	@Override
	public String virtualMachine() {
		System.out.println("AWS VM");
		return "AWS VM";
	}

	@Override
	public String storage() {
		System.out.println("AWS Storage");
		return "AWS Storage";
	}

}
