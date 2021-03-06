import java.awt.Color;

public class Cell {

	boolean alive;
	int numNeighbors;
	int[] position;
	Color color;
	
	public Cell(int x, int y) {
		position = new int[2];
		position[0] = x;
		position[1] = y;
		alive = false;
		numNeighbors = 0;
		color = Color.white;
	}
	
	public Cell(boolean a, int n) {
		position = new int[2];
		position[0] = 0;
		position[1] = 0;
		alive = a;
		numNeighbors = n;
		color = Color.white;
	}
	
	public Cell() {
		position = new int[2];
		position[0] = 0;
		position[1] = 0;
		alive = false;
		numNeighbors = 0;
		color = Color.white;
	}
	
	public Cell(int x, int y, boolean a, int n, Color c) {
		position = new int[2];
		position[0] = x;
		position[1] = y;
		alive = a;
		numNeighbors = n;
		color = c;
	}

	public void setAlive() {
		alive = !alive;
		//System.out.println("Cell ("+position[0]+", "+position[1]+")"+alive);
		if (alive) {
			color = Color.black;
		} else {
			color = Color.white;
		}
	}

	public boolean nextGeneration() {
		boolean isAlive = false;
		if (alive) {
			if (numNeighbors == 2 || numNeighbors == 3) {
				isAlive = true;
			} else {
				isAlive = false;
			}
		} else if (numNeighbors==3) {
			isAlive = true;
		}
		if (isAlive) {
			color = Color.black;
		} else {
			color = Color.white;
		}
		return isAlive;
	}
	
}
