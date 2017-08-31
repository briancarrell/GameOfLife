import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.Test;

public class AdvanceColorTest {

	// Methods being tested
	
	
	/*
	 * Tests to make sure cell n correctly changes based on cell c.
	 * Tests to make sure JButton changes background color to new color.
	 */
	private Color advanceColor(Cell c, Cell n) {
		n.alive = c.nextGeneration();
		n.color = c.color;
		return n.color;
	}
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////////////////
	//Tests
	
	
	/*
	 * Tests output of AdvanceColor
	 * If c is alive and stays alive, b is black
	 * If c is alive and dies, b is white
	 * If c is dead and becomes alive, b is black
	 * If c is dead and stays dead, b is white
	 */
	@Test
	public void aliveAndStaysAliveColorTest() {
		assertEquals(Color.black, advanceColor(new Cell(true, 3), new Cell()));
	}
	
	@Test
	public void aliveAndDiesColorTest() {
		assertEquals(Color.white, advanceColor(new Cell(true, 4), new Cell()));
	}
	
	@Test
	public void deadAndBecomesAliveColorTest() {
		assertEquals(Color.black, advanceColor(new Cell(false, 3), new Cell()));
	}
	
	@Test
	public void deadAndStaysDeadColorTest() {
		assertEquals(Color.white, advanceColor(new Cell(false, 1), new Cell()));
	}
	

}
