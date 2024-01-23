package strategy.example_one;

public final class PlusOperationStrategy extends AbstractOperationStrategy {

	public PlusOperationStrategy(int a, int b) {
		super(a, b);
	}

	@Override
	public void compute() {
		System.out.println(getA() + getB());
	}

}
