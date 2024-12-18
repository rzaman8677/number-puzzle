import java.util.ArrayList;
public class Driver{
    public static void main(String[] args) {
    	int[][] nums1Copy = {{5,7,8},{1,4,6},{2,0,3}};
    	NumberPuzzle b = new NumberPuzzle(nums1Copy);
        int[][] nums1 = {{5,7,8}, {1,4,6}, {2, 0, 3}};
        /*
         5 7 8
         1 4 6
         2 0 3
         */
        NumberPuzzle a = new NumberPuzzle(nums1);
        int[][] nums2 = {{5,7,8}, {1,4,6}, {0, 2, 3}};
        NumberPuzzle a2 = new NumberPuzzle(nums2);
        /*
         5 7 8
         1 4 6
         0 2 3
         */
        int[][] nums3 = {{5,7,8}, {1,4,6}, {2, 3, 0}};
        NumberPuzzle a3 = new NumberPuzzle(nums3);
        /*
         5 7 8
         1 4 6
         2 3 0
         */
        int[][] nums4 = {{5,7,8}, {1,0,6}, {2, 4, 3}};
        NumberPuzzle a4 = new NumberPuzzle(nums4);
        /*
         5 7 8
         1 0 6
         2 4 3
        */
        int[][] nums5 = {{5,7,8}, {0,1,6}, {2, 4, 3}};
        NumberPuzzle a5 = new NumberPuzzle(nums5);
        /*
         5 7 8
         0 1 6
         2 4 3
        */
        int[][] nums6 = {{5,7,8}, {6,1,0}, {2, 4, 3}};
        NumberPuzzle a6 = new NumberPuzzle(nums6);
        /*
         5 7 8
         6 1 0
         2 4 3
        */
        int[][] nums7 = {{5,7,0}, {6,1,8}, {2, 4, 3}};
        NumberPuzzle a7 = new NumberPuzzle(nums7);
        /*
         5 7 0
         6 1 8
         2 4 3
        */
        int[][] nums8 = {{5,0,7}, {6,1,8}, {2, 4, 3}};
        NumberPuzzle a8 = new NumberPuzzle(nums8);
        /*
         5 0 7
         6 1 8
         2 4 3
         */
        int[][] nums9 = {{0,5,7}, {6,1,8}, {2, 4, 3}};
        NumberPuzzle a9 = new NumberPuzzle(nums9);
        /*
         0 5 7
         6 1 8
         2 4 3
        */
        int[][] solvedPuzzle = {{1,2,3},{4,5,6},{7,8,0}}; // puzzle 10
        NumberPuzzle a10 = new NumberPuzzle(solvedPuzzle);
        /*
         1 2 3
         4 5 6
         7 8 0
         */
        int[][] solvedPuzzleShifted = {{1,2,3},{4,5,6},{7,0,8}}; //puzzle 11
        NumberPuzzle a11 = new NumberPuzzle(solvedPuzzleShifted);
        /*
         1 2 3
         4 5 6
         7 0 8
        */
        int[][] solvedPuzzleShifted2 = {{1,2,3},{4,5,0},{7,8,6}}; //puzzle 12
        NumberPuzzle a12 = new NumberPuzzle(solvedPuzzleShifted2);
        /*
         1 2 3
         4 5 0
         7 8 6
         */
        int[][] solvedPuzzleShifted3 = {{1,2,3},{4,5,6},{0,7,8}}; //puzzle 13
        NumberPuzzle a13 = new NumberPuzzle(solvedPuzzleShifted3);
        /*
         1 2 3 
         4 5 6 
         0 7 8
        */
        int[][] solvedPuzzleShifted5 = {{4,1,2},{7,5,3},{0,8,6}}; //puzzle 13
        NumberPuzzle a14 = new NumberPuzzle(solvedPuzzleShifted5);
        /*
         4 1 2 
         7 5 3 
         0 8 6
        */
//        ArrayList<NumberPuzzle> b7 = new ArrayList<NumberPuzzle>();
//        System.out.println(a14.solveNumberPuzzle(b7,6));
        //puzzle1
        //row 0, col 0
        System.out.println("Puzzle 1");
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 1; i < 4; i++) {
            	for(int i2 = 1; i2 < 4; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        System.out.println("Check if puzzles are equal");
        System.out.println(a.equals(b));
        System.out.println(a.equals(a2));
        System.out.println(a.equals(a3));
        System.out.println(a.equals(a4));
        System.out.println(a.equals(a5));
        System.out.println(a.equals(a6));
        System.out.println(a.equals(a7));
        System.out.println(a.equals(a8));
        System.out.println(a.equals(a9));
        System.out.println(a.equals(a10));
        System.out.println(a.equals(a11));
        System.out.println(a.equals(a12));
        System.out.println(a.equals(a13));
        
        //puzzle 2
        System.out.println("\nPuzzle 2");
        a = new NumberPuzzle(nums2);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 3
        System.out.println("\nPuzzle 3");
        a = new NumberPuzzle(nums3);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 4
        System.out.println("\nPuzzle 4");
        a = new NumberPuzzle(nums4);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 5
        System.out.println("\nPuzzle 5");
        a = new NumberPuzzle(nums5);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 6
        System.out.println("\nPuzzle 6");
        a = new NumberPuzzle(nums6);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 7
        System.out.println("\nPuzzle 7");
        a = new NumberPuzzle(nums7);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 8
        System.out.println("\nPuzzle 8");
        a = new NumberPuzzle(nums8);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 9
        System.out.println("\nPuzzle 9");
        a = new NumberPuzzle(nums9);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 10
        System.out.println("\nPuzzle 10");
        a = new NumberPuzzle(solvedPuzzle);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 11
        System.out.println("\nPuzzle 11");
        a = new NumberPuzzle(solvedPuzzleShifted);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 12
        System.out.println("\nPuzzle 12");
        a = new NumberPuzzle(solvedPuzzleShifted2);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
        
        //puzzle 13
        System.out.println("\nPuzzle 13");
        a = new NumberPuzzle(solvedPuzzleShifted3);
        //row 0, col 0
        System.out.println(a.getNum(0, 0));
        //row 0, col 1
        System.out.println(a.getNum(0, 1));
        //row 0, col 2
        System.out.println(a.getNum(0, 2));
        //row 1, col 0
        System.out.println(a.getNum(1, 0));
        //row 1, col 1
        System.out.println(a.getNum(1, 1));
        //row 1, col 2
        System.out.println(a.getNum(1, 2));
        //row 2, col 0
        System.out.println(a.getNum(2, 0));
        //row 2, col 1
        System.out.println(a.getNum(2, 1));
        //row 2, col 2
        System.out.println(a.getNum(2, 2));
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Empty Column Number: " + a.emptyCol());
        System.out.println("Empty Row Number: " + a.emptyRow());
        System.out.println();
        System.out.println("Solved: " + a.solved());
        System.out.println("Row: " + a.emptyRow() + " Col: " + a.emptyCol());
        System.out.println("Can Slide Upside: " + a.canSlide("U"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 1; i < 4; i++) {
            	for(int i2 = 1; i2 < 4; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("U")){
        	NumberPuzzle a13U = a.slide("U");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13U.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13U.emptyRow() + " Col: " + a13U.emptyCol());
        }
        System.out.println("Can Slide Down: " + a.canSlide("D"));
        if(a.canSlide("D")){
        	NumberPuzzle a13D = a.slide("D");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13D.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13D.emptyRow() + " Col: " + a13D.emptyCol());
        }
        System.out.println("Can Slide Right: " + a.canSlide("R"));
        if(a.canSlide("R")){
        	NumberPuzzle a13R = a.slide("R");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13R.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13R.emptyRow() + " Col: " + a13R.emptyCol());
        }
        System.out.println("Can Slide Left: " + a.canSlide("L"));
        if(a.canSlide("L")){
        	NumberPuzzle a13L = a.slide("L");
            for(int i = 0; i < 3; i++) {
            	for(int i2 = 0; i2 < 3; i2++) {
                	System.out.print(a13L.getNum(i, i2));
                }
            }
            System.out.println("Row: " + a13L.emptyRow() + " Col: " + a13L.emptyCol());
        }
    }
}