package decorator;

public class LuxuryCar extends DecoratorCar {

	public LuxuryCar(Car car) {
		super(car);
	}
	
	public void design() {
		super.design();
		System.out.println("Luxury Car");
	}

}
