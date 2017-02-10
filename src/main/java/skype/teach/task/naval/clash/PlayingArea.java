package skype.teach.task.naval.clash;

/**
 *
 */
public class PlayingArea {

    private static final int WIDTH = 10;
    private static final int LENGTH = 10;

    private ShipCell[][] battlefield;

    public PlayingArea() {
        battlefield = new ShipCell[WIDTH][LENGTH];
        for (int i = 0; i < battlefield.length - 1; i++) {
            for (int j = 0; j < battlefield.length - 1; j++) {
                battlefield[i][j] = new ShipCell();
            }
        }
    }

    public ShipCell getCell(int row, int col) {
        return battlefield[row][col];
    }

    public void setShip(Ship ship){

    }

    public void hit(int row, int col){
        Cell cell = getCell(row, col);
        cell.hit();
    }
}
