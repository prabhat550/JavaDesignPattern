package factory;

public class GCP implements CloudPlatform {

	@Override
	public String virtualMachine() {
		System.out.println("GCP VM");
		return "GCP VM";
	}

	@Override
	public String storage() {
		System.out.println("GCP Storage");
		return "GCP Storage";
	}

}
