package decorator;

public class DecoratorCar implements Car {

	private Car car;

	public DecoratorCar(Car car) {
		this.car = car;
	}

	public void design() {
		this.car.design();
	}

}
