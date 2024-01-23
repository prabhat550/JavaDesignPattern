package strategy.example_three;

public class PlayerContext {
	
	IStrategy behaviour;
	String type;
	
	public PlayerContext(String type) {
		this.type = type;
	}

	public void setBehaviour(IStrategy behaviour) {
		this.behaviour = behaviour;
	}
	
	public void action() {
		System.out.println("Player : " + this.type);
		behaviour.actionCommand();
	}

}
