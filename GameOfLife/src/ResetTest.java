import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class ResetTest {

	// Methods being tested
	
	/*
	 * Tests to make sure cell n correctly changes based on cell c.
	 * Tests to make sure JButton changes background color to new color.
	 */
	private Cell reset(Cell c) {
		c = new Cell(0,0);
		return c;
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////
	//Tests
	
	/*
	 * Tests to make sure new Cell is completely reset
	 * x and y should be 0
	 * alive should be false
	 * numNeighbors should be 0
	 * color should be white
	 */
	@Test
	public void resetPositionTest() {
		assertEquals(0, reset(new Cell(1, 1, true, 3, Color.black)).position[0]);
		assertEquals(0, reset(new Cell(1, 1, true, 3, Color.black)).position[1]);
	}
	
	@Test
	public void resetAliveTest() {
		assertEquals(false, reset(new Cell(1, 1, true, 3, Color.black)).alive);
	}
	
	@Test
	public void resetNumNeighborsTest() {
		assertEquals(0, reset(new Cell(1, 1, true, 3, Color.black)).numNeighbors);
	}
	
	@Test
	public void resetColorTest() {
		assertEquals(Color.white, reset(new Cell(1, 1, true, 3, Color.black)).color);
	}

}
