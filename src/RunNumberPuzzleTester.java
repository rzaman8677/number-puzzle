//DO NOT CHANGE THIS FILE!!!
//If there are errors, fix your own program
class RunNumberPuzzleTester {
	public void alivenessTest(int[][] matrix){
		NumberPuzzle n = new NumberPuzzle(matrix);
		int x =n.getNum(0,0);
		int i=n.emptyRow();
		int j=n.emptyCol();
		boolean b=!n.solved() || n.canSlide("U");;
		if (b){
		 n=n.slide("U");
		 System.out.println(x+i+j+n.getNum(0,0));
		}
	}
	public static void main (String Args[])
    {
    	AssignmentTester test = new NumberPuzzleTester();
    	test.runTestCases();

    }
}
