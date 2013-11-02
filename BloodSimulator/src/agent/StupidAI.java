package agent;

import environment.Damier;
 
/*
 * a basic ia, run against the ball
 */ 
public class StupidAI implements AI{
	Damier damier;
	public StupidAI(Damier damier) {
		this.damier = damier;
	}

	@Override
	public void todo(Agent agent) {
		
	}

}
