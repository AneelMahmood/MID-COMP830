package command;

public class Player {
	
	private int xCoord;
	private int yCoord;
	private static Player instance;
	
	private Player() {
		xCoord = 0;
		yCoord = 0;
	}
	
	public static Player getInstance() {
		if (instance == null)
			instance = new Player();
		return instance;
	}
	
	public int getX() {
		return xCoord;
	}
	
	public void setX(int x) {
		this.xCoord = x;
	}
	
	public int getY() {
		return yCoord;
	}
	
	public void setY(int y) {
		this.yCoord = y;
	}
	
	public void printCoords() {
		System.out.println("Player move: X: " + xCoord + ", Y: " + yCoord);
	}

}