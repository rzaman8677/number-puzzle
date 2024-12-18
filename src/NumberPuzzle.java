import java.util.ArrayList;
public class NumberPuzzle {
	private int[][] copiedPuzzle;
	NumberPuzzle(int[][] nums){
		copiedPuzzle = new int[3][3];
		int rowNum = 0;
		for(int[]row: nums) {
			int colNum = 0;
			for(int item: row) {
				copiedPuzzle[rowNum][colNum] = item;
				colNum+=1;
			}
			rowNum+=1;
		}
	}
	
	public int getNum(int row, int column) {
		return copiedPuzzle[row][column];
	}
	
	public int emptyRow() {
		int zeroRow = 0;
		int row = 0;
		for(int[] rowNum: copiedPuzzle) {
			for(int item: rowNum) {
				if(item == 0) {
					zeroRow = row;
				}
			}
			row+=1;
		}
		return zeroRow;
	}
	
	public int emptyCol() {
		int zeroCol = 0;
		for(int[] rowNum: copiedPuzzle) {
			int col = 0;
			for(int item: rowNum) {
				if(item == 0) {
					zeroCol = col;
				}
				col+=1;
			}
		}
		return zeroCol;
	}
	
	public boolean solved() {
		boolean solved = true;
		for(int row = 0; row < 3; row++) {
			for(int col = 0; col < 3; col++) {
				int actualRow = row + 1;
				int actualCol = col + 1;
				int actualVal = 0;
				if(actualRow == 1) {
					actualVal = 0 + actualCol;
				} else if(actualRow == 2) {
					actualVal = 3 + actualCol;
				} else if(actualRow == 3){
                    if(actualCol == 3) {
                        actualVal = 0;
                    } else {
                        actualVal = 6 + actualCol;
                    }
				}
				if(!(copiedPuzzle[row][col] == actualVal)) {
                    solved = false;
				}
			}
		}
		return solved;
	}
	
	public NumberPuzzle slide(String dir) {
		int[][] newCopiedPuzzle = new int[3][3];
		int rowNum = 0;
		for(int[]row: copiedPuzzle) {
			int colNum = 0;
			for(int item: row) {
				newCopiedPuzzle[rowNum][colNum] = item;
				colNum+=1;
			}
			rowNum+=1;
		}
		if(dir.equals("U")) {
			newCopiedPuzzle[emptyRow()][emptyCol()] = copiedPuzzle[emptyRow()+1][emptyCol()];
			newCopiedPuzzle[emptyRow()+1][emptyCol()] = copiedPuzzle[emptyRow()][emptyCol()];
		} else if(dir.equals("D")) {
			newCopiedPuzzle[emptyRow()][emptyCol()] = copiedPuzzle[emptyRow()-1][emptyCol()];
			newCopiedPuzzle[emptyRow()-1][emptyCol()] = copiedPuzzle[emptyRow()][emptyCol()];
		} else if(dir.equals("L")) {
			newCopiedPuzzle[emptyRow()][emptyCol()] = copiedPuzzle[emptyRow()][emptyCol()+1];
			newCopiedPuzzle[emptyRow()][emptyCol()+1] = copiedPuzzle[emptyRow()][emptyCol()];
		} else if(dir.equals("R")) {
			newCopiedPuzzle[emptyRow()][emptyCol()] = copiedPuzzle[emptyRow()][emptyCol()-1];
			newCopiedPuzzle[emptyRow()][emptyCol()-1] = copiedPuzzle[emptyRow()][emptyCol()];
		} 
		NumberPuzzle newPuzzle = new NumberPuzzle(newCopiedPuzzle);
		return newPuzzle;
	}
	
	public boolean canSlide(String dir) {
		if(!(dir.equals("U") || dir.equals("D") || dir.equals("R") || dir.equals("L"))) {
			return false;
		}
		else if(dir.equals("U")) {
			if(emptyRow() == 2) {
				return false;
			} else {
				return true;
			}
		} else if(dir.equals("D")){
			if(emptyRow()==0) {
				return false;
			} else {
				return true;
			}
		} else if(dir.equals("R")) {
			if(emptyCol() == 0) {
				return false;
			} else {
				return true;
			}
		} else {
			if(emptyCol() == 2) {
				return false;
			} else {
				return true;
			}
		}
	}
	
	public boolean equals(NumberPuzzle other) {
		boolean equal = true;
		for(int rows = 0; rows < 3; rows++) {
			for(int cols = 0; cols < 3; cols++) {
				if(!(other.getNum(rows, cols) == getNum(rows, cols))) {
					equal = false;
				}
			}
		}
		return equal;
	}
	
	public String solveNumberPuzzle(ArrayList<NumberPuzzle> restricted, int maxMoves) {
	    if (this.solved()) {
	    	while(restricted.size() > 1) {
	    		restricted.remove(restricted.size() - 1);
	    	}
	        return "";
	    }
	    
	    if (maxMoves == 0 || restricted.contains(this)) {
	        return null;
	    }
	    
	    restricted.add(this);

	    String minSolution = null;
	    int minSlides = Integer.MAX_VALUE;

	    String upSolution = null;
	    if (this.canSlide("U")) {
	        upSolution = this.slide("U").solveNumberPuzzle(restricted, maxMoves - 1);
	        if (upSolution != null && upSolution.length() < minSlides) {
	            minSolution = "U" + upSolution;
	            minSlides = upSolution.length();
	        }
	    }

	    String downSolution = null;
	    if (this.canSlide("D")) {
	        downSolution = this.slide("D").solveNumberPuzzle(restricted, maxMoves - 1);
	        if (downSolution != null && downSolution.length() < minSlides) {
	            minSolution = "D" + downSolution;
	            minSlides = downSolution.length();
	        }
	    }

	    String leftSolution = null;
	    if (this.canSlide("L")) {
	        leftSolution = this.slide("L").solveNumberPuzzle(restricted, maxMoves - 1);
	        if (leftSolution != null && leftSolution.length() < minSlides) {
	            minSolution = "L" + leftSolution;
	            minSlides = leftSolution.length();
	        }
	    }

	    String rightSolution = null;
	    if (this.canSlide("R")) {
	        rightSolution = this.slide("R").solveNumberPuzzle(restricted, maxMoves - 1);
	        if (rightSolution != null && rightSolution.length() < minSlides) {
	            minSolution = "R" + rightSolution;
	            minSlides = rightSolution.length();
	        }
	    }

	    return minSolution;
	}
}