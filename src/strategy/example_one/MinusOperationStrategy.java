package strategy.example_one;

public final class MinusOperationStrategy extends AbstractOperationStrategy {

	public MinusOperationStrategy(int a, int b) {
		super(a, b);
	}

	@Override
	public void compute() {
		System.out.println(getA() - getB());
	}
}
