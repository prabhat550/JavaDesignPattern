package decorator;

public class Demo {

	public static void main(String[] args) {

		BasicCar basicCar = new BasicCar();
		Car passengerCar = new PassengerCar(basicCar);
		passengerCar.design();
		System.out.println("-----");
		Car luxuryCar = new LuxuryCar(basicCar);
		luxuryCar.design();
		System.out.println("-----");
		Car passengerLuxuryCar = new LuxuryCar(passengerCar);
		passengerLuxuryCar.design();

	}

}
