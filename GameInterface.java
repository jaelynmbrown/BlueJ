
/**
 * Method signatures of the methods the TicTacToe class will implement
 *
 * @author Jaelyn Brown
 * @version 1
 */
public interface GameInterface
{
    public void clearGrid(); 
    public void printGrid();
    public void changePlayer();
    public void placeLetter(int rowSpot, int colSpot);
    public boolean isGridFull();
    public boolean isWinner();
    public boolean searchRow() ;
    public boolean searchColumns();
    public boolean searchDiag();
}
