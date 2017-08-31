import static org.junit.Assert.*;

import org.junit.Test;

public class AdvanceBooleanTest {

	// Methods being tested
	
	/*
	 * Tests to make sure cell n correctly changes based on cell c.
	 * Tests to make sure JButton changes background color to new color.
	 */
	private boolean advanceBoolean(Cell c, Cell n) {
		n.alive = c.nextGeneration();
		n.color = c.color;
		return n.alive;
	}
	

	//////////////////////////////////////////////////////////////////////////////////////////
	//Tests

	/*
	 * Tests output of AdvanceBoolean
	 * If c is alive and stays alive, n is alive
	 * If c is alive and dies, n is dead
	 * If c is dead and becomes alive, n is alive
	 * If c is dead and stays dead, n is dead
	 */
	@Test
	public void aliveAndStaysAliveBoolTest() {
		assertEquals(true, advanceBoolean(new Cell(true, 3), new Cell()));
	}
	
	@Test
	public void aliveAndDiesBoolTest() {
		assertEquals(false, advanceBoolean(new Cell(true, 4), new Cell()));
	}
	
	@Test
	public void deadAndBecomesAliveBoolTest() {
		assertEquals(true, advanceBoolean(new Cell(false, 3), new Cell()));
	}
	
	@Test
	public void deadAndStaysDeadBoolTest() {
		assertEquals(false, advanceBoolean(new Cell(false, 1), new Cell()));
	}
	
}
