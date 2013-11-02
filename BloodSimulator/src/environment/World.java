package environment;

import java.util.List;

import agent.AI;
import agent.Agent;
import agent.Modifieur;
import agent.StupidAI;


public class World {
	AI ai; 
	Damier damier;
	List<Modifieur> modifieurs;
	List<Agent> agents;
	public World() {
		damier = new Damier();
		ai = new StupidAI(damier);
	}
	public void turn() {
		for (Agent agent : agents) {
			agent.play(ai);
		}
	}
	public void setAgent(List<Agent> agents) {
		this.agents = agents; 
	}
}
