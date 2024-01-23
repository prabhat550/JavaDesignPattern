package strategy.example_two;

public class StrategyContext {

	public Strategy strategy;

	public StrategyContext(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int doExecute(int a , int b) {
		return strategy.doOperation(a, b);
	}

}
