import java.util.ArrayList;

//DO NOT CHANGE THIS FILE!!!
//If there are errors, fix your own program
class RunNumberPuzzleSolverTester {
	public void alivenessTest(int[][] matrix){
		NumberPuzzle n = new NumberPuzzle(matrix);
		n.solveNumberPuzzle(new ArrayList<NumberPuzzle>(),0);
	}
	public static void main (String Args[])
    {
    	AssignmentTester test = new NumberPuzzleSolverTester();
    	test.runTestCases();

    }
}
