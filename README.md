# ComResource-Kata

Conway's Game of Life
Brian Carrell
August 31, 2017

Project Set Up

Within the GameOfLife folder, there are six .java files.
Four are unit tests, and the other two are functional classes:

-GOLFrame: This is the main class. Contains the main method and GUI.
-Cell: This is a class used to build the grids. Contains constructors and methods.

-CellTest: Unit tests for the methods in the Cell class (nextGeneration and setAlive).
	-nextGeneration tests the logic of the Game of Life to see which cells will
	survive until the next generation. Cases are based on wether or not the Cell is
	currently alive and how many living neighbors it has.
	-setAlive tests the function of changing a Cell's alive status when it is
	clicked in the GUI.
-UpdateNumNeighborsTest: Unit tests for the updateNumNeighbors method in GOLFrame.
	-There are several cases in this class representing the different number of
	neighbors a Cell can have. Cases are an empty grid, a grid of less than 2x2,
	a corner spot on a larger grid, an edge spot on a larger grid, and a middle spot
	on a larger grid. With this many tests, it is possible to test the updateNumNeighbors
	function completely.
-AdvanceTest: Unit tests for the advance method in GOLFrame.
	-AdvanceTest verifies that an dead Cell (the Next State grid) takes on the
	nextGeneration attributes of another Cell (the Initial State grid). It checks for the
	alive status and the color of the new Cell, so that the actual advance method can apply
	those attributes to the Next State Cell.
-ResetTest: Unit tests for the reset method in GOLFrame.
	-ResetTest verifies that any newly created Cell has all default values, as the reset
	function repopulates the Cell arrays with new Cells.

All except the Cell class can be run directly using the Run function (in Eclipse, the
Java IDE I used for development).

User will require a Java IDE (Eclipse, etc) to run this program.

Additional Features implemented include the designed interface and the ability to change
the grid size in the main method (GOLFrame.java line 23). Window will not be correctly
sized for different grid sizes, but can be expanded/shrunk.