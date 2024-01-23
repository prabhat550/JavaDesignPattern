package decorator;

public class PassengerCar extends DecoratorCar {

	public PassengerCar(Car car) {
		super(car);
	}

	public void design() {
		super.design();
		System.out.println("Passenger Car");

	}

}
