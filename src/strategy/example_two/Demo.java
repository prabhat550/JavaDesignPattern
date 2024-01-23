package strategy.example_two;

public class Demo {

	public static void main(String[] args) {

		StrategyContext sc1 = new StrategyContext(new OperationAdd());
		int result = sc1.doExecute(3, 5);
		System.out.println(result);

	}

}
