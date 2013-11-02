package agent;

import java.util.ArrayList;
import java.util.List;

import environment.Damier;
import tools.Point;

public class AITool {
	/* 
	 * give the nearest joignable free point to the ball
	 */
	public static Point toTheBall(Agent agent, Damier damier) {
		List<Point> pathToTheBall = new ArrayList<Point>();
		//TODO get a real algorithm.
		for(Point availlablePoint : pathToTheBall) {
			char asciiRepresentation = damier.getEntity(availlablePoint).getAsciiRepresentation();
			if(asciiRepresentation == ' ') {
				return availlablePoint;
			}
		}
		return null;
	}
	
	public static Point toTheGoal(Agent agent, Damier damier) {
		
	}
}
