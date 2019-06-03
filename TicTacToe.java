
/**
 * This program will create a 2D Array that will act as a tic tac toe board
 * It will use for loops, conditionals...
 *
 * @author Jaelyn Brown
 * @version 1
 */
public class TicTacToe implements GameInterface
{
    private String[][] grid; // declare 2D array that will act as game board
    public String marker; //holds x's and o's 
    
    //constructor
    public TicTacToe() {
        //initialize 3x3 array to imitate 3x3 tic tac toe grid
        grid = new String[3][3]; 
        
        //begin with x, later we will switch back and forth from x to o
        marker = " X ";
        
    }
    
    //set (or reset) board to empty values 
    public void clearGrid() {
        //traverse array
        
        //loop through rows
        for (int row = 0; row < 3; row ++) { 
            //loop through columns
            for (int col = 0; col < 3; col++ ) { 
                grid[row][col] = "   "; // set or reset each element to
                                        // blank spaces
            }
        }
        //printGrid();
    }
    
    // print out dashes that will outline the grid
    
    public void printGrid(){
        //loop through rows
        for (int i = 0; i < 3; i++) {
            //loop through columns
            for (int j = 0; j < 3; j++) {
               //control when the dividing line is printed between elements
               if(j <=1  ) { 
                //two row elements will print with a dividing bar
                System.out.print(grid[i][j] + " | ");
               }
               else{
                //third row elements will print without a bar following
                System.out.print(grid[i][j]);
               }
           }
            
           System.out.println();
           
           //if statement prevents the dividing dashes from printing
           //a third time below the last row of elements
            if (i <2 ) { 
            System.out.println("---------------");
           }
        }
    }
    
   
    //switch from x to o every turn
    public void changePlayer() {
        if (marker == " X ") {
            marker = " O ";
        }
        else{
            marker = " X ";
        }
        
    }
    
    
    // assign value to users chosen location
    public void placeLetter(int rowSpot, int colSpot) {
        grid[rowSpot][colSpot] = marker;
        printGrid();
    }
    
    public boolean isGridFull() {
        boolean isGridFull = true;
        //loop through rows
        for (int row = 0; row < 3; row ++) { 
            //loop through columns
            for (int col = 0; col < 3; col++ ) { 
                if (grid[row][col].equals("   ")) {
                    isGridFull = false;
                }
            }
        }
        return isGridFull;
    }
    
    public boolean isWinner() {
        return (searchRow() || searchDiag() || searchColumns());
    }
    
    public boolean searchRow() {
        boolean isRowWin = false;
        
        //loop through rows
        for (int row = 0; row < 3; row ++) { 
            if(grid[row][0].equals(" X ") && grid[row][1].equals(" X ") && grid[row][2].equals(" X ")) {
             isRowWin = true;
            }
            else if(grid[row][0].equals(" O ") && grid[row][1].equals(" O ") && grid[row][2].equals(" O ")) {
            isRowWin = true;
            }
        }
        return isRowWin;
       
    }
   
    public boolean searchColumns() {
        boolean isColWin = false;
        
        //loop through columns
        for (int col = 0; col < 3; col ++) { 
            if(grid[0][col].equals(" X ") && grid[1][col].equals(" X ") && grid[2][col].equals(" X ")) {
             isColWin = true;
            }
            else if(grid[0][col].equals(" O ") && grid[1][col].equals(" O ") && grid[2][col].equals(" O ")) {
            isColWin = true;
            }
        }
        return isColWin;
       
    }
    
    public boolean searchDiag() {
        boolean isDiagWin = false;
        
        //loop through rows
        for (int row = 0; row < 3; row ++) { 
            //loop through columns
            for (int col = 0; col < 3; col++ ) { 
                if (grid[0][0].equals(" X ") && grid[1][1].equals(" X ") && grid[2][2].equals(" X ") || grid[2][0].equals(" X ") && grid[1][1].equals(" X ") && grid[0][2].equals(" X ")) {
                   isDiagWin = true; 
                }
                else if (grid[0][0].equals(" O ") && grid[1][1].equals(" O ") && grid[2][2].equals(" O ") || grid[2][2].equals(" O ") && grid[1][1].equals(" O ") && grid[0][0].equals(" O ")){
                   isDiagWin = true;
                }
        
            }
        }
        return isDiagWin;
        
    } 
}  

