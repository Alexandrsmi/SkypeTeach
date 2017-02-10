package skype.teach.task.naval.clash.console;

import skype.teach.task.naval.clash.Board;
import skype.teach.task.naval.clash.Cell;

/**
 *
 */
public class ConsoleBoard implements Board {
    private Cell[][] cells;
    @Override
    public void drawBoard(Cell[][] cells) {
this.cells = cells;

    }

    @Override
    public void drawCell(Cell[][] cells) {

    }

    private void redraw(boolean real){
        for(Cell[]row:cells){
            for(Cell cell:row){
                cell.draw(System.out,real);
            }
            System.out.println();
        }
        System.out.println();
    }
}
