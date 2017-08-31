import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class AdvanceTest {

	// Methods being tested
	
	/*
	 * Tests to make sure cell n correctly changes based on cell c.
	 * Tests to make sure JButton changes background color to new color.
	 */
	private Cell advanceBoolean(Cell c, Cell n) {
		n.alive = c.nextGeneration();
		n.color = c.color;
		return n;
	}
	

	//////////////////////////////////////////////////////////////////////////////////////////
	//Tests

	/*
	 * Tests output of AdvanceBoolean
	 * If c is alive and stays alive, n is alive and black
	 * If c is alive and dies, n is dead and white
	 * If c is dead and becomes alive, n is alive and black
	 * If c is dead and stays dead, n is dead and white
	 */
	@Test
	public void aliveAndStaysAliveTest() {
		assertEquals(true, advanceBoolean(new Cell(true, 3), new Cell()).alive);
		assertEquals(Color.black, advanceBoolean(new Cell(true, 3), new Cell()).color);
	}
	
	@Test
	public void aliveAndDiesTest() {
		assertEquals(false, advanceBoolean(new Cell(true, 4), new Cell()).alive);
		assertEquals(Color.white, advanceBoolean(new Cell(true, 4), new Cell()).color);
	}
	
	@Test
	public void deadAndBecomesAliveTest() {
		assertEquals(true, advanceBoolean(new Cell(false, 3), new Cell()).alive);
		assertEquals(Color.black, advanceBoolean(new Cell(false, 3), new Cell()).color);
	}
	
	@Test
	public void deadAndStaysDeadTest() {
		assertEquals(false, advanceBoolean(new Cell(false, 1), new Cell()).alive);
		assertEquals(Color.white, advanceBoolean(new Cell(false, 1), new Cell()).color);
	}
	
}
