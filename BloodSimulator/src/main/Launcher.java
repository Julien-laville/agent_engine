package main;

import java.util.ArrayList;
import java.util.List;

import agent.Agent;
import environment.Game;
import environment.World;

public class Launcher {
	public static void main(String argv) {
		World world = extractWorldProperties();
		world.setAgent(extractTeamProperties());
		Game game = new Game(world);
		game.run();
	}
	
	
	
	private static World extractWorldProperties() {
		return new World();
	}
	private static List<Agent> extractTeamProperties() {
		return new ArrayList<Agent>();
	}
}
