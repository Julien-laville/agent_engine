package agent;

import java.awt.geom.Point2D;
import java.util.List;

import environment.Box;
import tools.Point;


public class Agent {
	private static enum TEAM_COLOR{RED, BLUE};
	
	private Box position;
	private TEAM_COLOR color;
	private int hp;
	private int mana;
	private List<Modifieur> modifieurs;
	private boolean isAlive;

	private Agent() {
		
	}
	
	public static Agent initAgent() {
		return new Agent();
	}
	
	public void play() {
		if(isAlive) {
			applyModifieurs();
		}
	}
	
	public void applyModifieurs() {
		for (Modifieur modifieur : modifieurs) {
			modifieur.apply(this);
		}
	}
}
