package strategy.example_one;

public class Demo {

	public static void main(String[] args) {

		CalculatorContext ctx = new CalculatorContext(new PlusOperationStrategy(2, 3));
		ctx.compute();

		ctx.setStrategy(new MinusOperationStrategy(5, 1));
		ctx.compute();

	}

}
