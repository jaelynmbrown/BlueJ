import java.util.*;
/**
 * Calls the TicTacToe object to perform operations that create the game.
 *
 * @author Jaelyn Brown
 * @version 1
 */
public class Main
{
    public static void main(String args[]) {
        TicTacToe t1 = new TicTacToe(); //create TicTacToe object
        t1.clearGrid(); //begin by making sure all elements have been set
                        //to blank spaces
        
        System.out.println("Lets play Tic Tac Toe!");
        //while the grid still has empty spaces left and 
        //no wins have ocurred yet, the loop will continue running
        while (t1.isGridFull() != true && t1.isWinner() != true) {
            Scanner in = new Scanner(System.in);
            
            System.out.println();
            //System.out.println("Do you want to play Tic Tac Toe? (Reply Y/N)");
            //String reply = in.nextLine();
            
            System.out.println("Player " + t1.marker +", Please enter coordinates: ");
            System.out.println("Row number(1-3):");
            int x = in.nextInt();
            System.out.println("Column number(1-3):");
            System.out.println();
            int y = in.nextInt();
            t1.placeLetter(x -1, y -1);
            System.out.println();
            t1.changePlayer();
            System.out.println();
           
           
        }
        
          
        //in the case that the grid is ful but no one wins, print this
        //message...
        if (t1.isGridFull() && t1.isWinner() != true) {
            System.out.println("Game Over - Players Tied");
            t1.clearGrid(); //clear grid - which will trigger the game 
                            //to start again
        }
        //in the case that there is a winner, print the winner's player 
        //mark...
        else if(t1.isWinner()) {
            t1.changePlayer(); //after winning the player mark will
                               //be changed, so here I have to change
                               //it again to print the accurate winner
            
            System.out.println("Game Over - Player" + t1.marker + "Wins");
            
            t1.clearGrid(); //clear grid - which will trigger the game 
                            //to start again
       }
       
        /*
         * if(t1.isGridFull() || t1.isWinner()) {
            Scanner ask = new Scanner(System.in);
            System.out.println("Do you want to play another game? (Reply Y/N)");
            String reply = ask.nextLine();
            if (reply.equals("Y") || reply.equals("y")){
                t1.clearGrid();
            }
            else{
                System.out.println("Okay! Come back soon!");
                
            }
            */
   
  }
}


