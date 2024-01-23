package strategy.example_three;

public class Demo {

	public static void main(String[] args) {
		
		PlayerContext terrorist = new PlayerContext("Terrorist");
		PlayerContext counterTerrorist = new PlayerContext("Counter Terrorist");
		
		System.out.println("Before the bomb is planted");
		terrorist.setBehaviour(new AggresiveStrategy());
		counterTerrorist.setBehaviour(new DefensiveStrategy());
		
		terrorist.action();
		counterTerrorist.action();
		
		System.out.println();
		
		System.out.println("After the bomb is planted");
		terrorist.setBehaviour(new DefensiveStrategy());
		counterTerrorist.setBehaviour(new AggresiveStrategy());
		
		terrorist.action();
		counterTerrorist.action();
		
		
	}

}
