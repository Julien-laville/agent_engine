package tools;


public class Point {
	private int x;
	private int y;
	
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int distance(Point point) {
		return Math.abs(this.x - point.x) + Math.abs(this.y - point.y);
	}
}

