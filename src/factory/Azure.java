package factory;

public class Azure implements CloudPlatform {

	@Override
	public String virtualMachine() {
		System.out.println("Azure VM");
		return "Azure VM";
	}

	@Override
	public String storage() {
		System.out.println("Azure Storage");
		return "Azure Storage";
	}

}
