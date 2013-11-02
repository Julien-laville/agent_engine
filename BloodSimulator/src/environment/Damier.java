package environment;

import java.util.List;

import agent.DamierEntity;
import tools.Point;

public class Damier {
	private static final int TOTAL_LINE = 10;
	private static final int TOTAL_COLUMN = 10;

	List<Box> boxes; 
	List<DamierEntity> damierEntities;
	
	public String toString(){
		StringBuffer damierAscii = new StringBuffer();
		for(int lineCount = 0; lineCount < TOTAL_LINE; lineCount += 1 ){
			for(int columnCount = 0; columnCount < TOTAL_COLUMN; columnCount += 1) {
				Point currentPosition = new Point(lineCount, columnCount);
				DamierEntity currentEntity = getEntity(currentPosition);
				damierAscii.append(currentEntity.getAsciiRepresentation());
			}
		}
		return damierAscii.toString();
	}
	public DamierEntity getEntity(Point position) {
		for (DamierEntity damierEntitie : damierEntities) {
			if(damierEntitie.getPosition().equals(position)) {
				return damierEntitie;
			}
		}
		return new FreeBox();
	}
}
