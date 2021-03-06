import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {

	// Methods being tested
	
	/*
	 * Determines if the cell is alive in the next generation based on its
	 * number of living neighbors.
	 */
	public boolean nextGeneration(boolean isAlive, int numNeighbors) {
		boolean alive = isAlive;
		if (alive) {
			if (numNeighbors == 2 || numNeighbors == 3) {
				alive = true;
			} else {
				alive = false;
			}
		} else if (numNeighbors==3) {
			alive = true;
		}
		return alive;
	}
	
	
	/*
	 * Switches cell between dead and alive when clicked
	 */
	public boolean setAlive(boolean alive) {
		alive = !alive;
		return alive;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	//Tests
	
	
	/*
	 * Tests logic of updating the cell's living status in the next generation.
	 * If alive and less than 2 neighbors, it dies.
	 * If alive and more than 3 neighbors, it dies.
	 * If alive and 2 or 3 neighbors, it lives.
	 * If dead and exactly 3 neighbors, it becomes alive.
	 * If dead and any other number of neighbors, it stays dead.
	 */
	@Test
	public void aliveAndLessThanTwoNeighbors() {
		assertEquals(false, nextGeneration(true, 0));
		assertEquals(false, nextGeneration(true, 1));
	}
	
	@Test
	public void aliveAndMoreThanThreeNeighbors() {
		assertEquals(false, nextGeneration(true, 4));
		assertEquals(false, nextGeneration(true, 5));
		assertEquals(false, nextGeneration(true, 6));
		assertEquals(false, nextGeneration(true, 7));
		assertEquals(false, nextGeneration(true, 8));
	}
	
	@Test
	public void aliveAndTwoOrThreeNeighbors() {
		assertEquals(true, nextGeneration(true, 2));
		assertEquals(true, nextGeneration(true, 3));
	}
	
	@Test
	public void deadAndThreeNeighbors() {
		assertEquals(true, nextGeneration(false, 3));
	}
	
	@Test
	public void deadAndNotThreeNeighbors() {
		assertEquals(false, nextGeneration(false, 0));
		assertEquals(false, nextGeneration(false, 1));
		assertEquals(false, nextGeneration(false, 2));
		assertEquals(false, nextGeneration(false, 4));
		assertEquals(false, nextGeneration(false, 5));
		assertEquals(false, nextGeneration(false, 6));
		assertEquals(false, nextGeneration(false, 7));
		assertEquals(false, nextGeneration(false, 8));
	}

	
	/*
	 * Tests to see if setAlive switches alive
	 * True should return false
	 * False should return true
	 */
	@Test
	public void setAliveTest() {
		assertEquals(false, setAlive(true));
		assertEquals(true, setAlive(false));
	}
	
}

