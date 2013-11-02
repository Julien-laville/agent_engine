package agent;

import java.awt.geom.Point2D;
import java.util.List;

import action.Action;
import environment.Box;
import tools.Point;


public class Agent implements DamierEntity{
	private static enum TEAM_COLOR{RED, BLUE};
	
	private Action actionPending;
	private Point position;
	private TEAM_COLOR color;
	private int hp;
	private int mana;
	private List<Modifieur> modifieurs;
	private boolean isAlive;
	private int timePoint;

	private Agent() {
	}
	
	public static Agent initAgent() {
		return new Agent();
	}
	
	public void play(AI ai) {
		if(isAlive) {
			applyModifieurs();
			applyIA(ai);
		}
	}
	
	public void move(Point position) {
		
	}
	
	private void applyIA(AI ai) {
		ai.todo(this);	
	}

	public void applyModifieurs() {
		for (Modifieur modifieur : modifieurs) {
			modifieur.apply(this);
		}
	}

	@Override
	public Point getPosition() {
		return position;
	}

	@Override
	public char getAsciiRepresentation() {
		if(!isAlive) {
			return 'd';
		}
		if(color.equals(TEAM_COLOR.BLUE)) {
			return 'b';
		} else {
			return 'r';
		}
	}
}
