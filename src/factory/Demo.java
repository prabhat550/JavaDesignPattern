package factory;

public class Demo {

	public static void main(String[] args) {
		
		CloudPlatform aws = CloudFactory.getCloudPlatorm("AWS");
		aws.virtualMachine();
		aws.storage();
		
		CloudPlatform azure = CloudFactory.getCloudPlatorm("Azure");
		azure.virtualMachine();
		azure.storage();
				
		CloudPlatform gcp = CloudFactory.getCloudPlatorm("GCP");
		gcp.virtualMachine();
		gcp.storage();

	}

}
