package environment;

import java.util.List;

import agent.Agent;
import agent.Modifieur;


public class World {
	Damier damier;
	List<Modifieur> modifieurs;
	List<Agent> agents;
	public World() {
		damier = new Damier();
		
	}
	public void turn() {
		for (Agent agent : agents) {
			agent.play();
		}
	}
}
