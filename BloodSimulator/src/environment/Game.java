package environment;

public class Game {
	private static final int MAX_TURN = 30;
	private World world;
	
	public Game(World world) {
		this.world = world;	
	}

	public void run() {
		for(int i = 0; i < MAX_TURN; i += 1) {
			world.turn();	
		}
	}
}
