package factory;

public class CloudFactory {

	public static CloudPlatform getCloudPlatorm(String cloud) {
		if (cloud == null || cloud.isEmpty())
			return null;
		switch (cloud) {
		case "AWS":
			return new AWS();
		case "Azure":
			return new Azure();
		case "GCP":
			return new GCP();
		default:
			throw new IllegalArgumentException("Unknown CloudPlatform " + cloud);
		}
	}

}
