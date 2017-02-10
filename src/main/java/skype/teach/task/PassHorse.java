package skype.teach.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * http://informatics.mccme.ru/moodle/mod/statements/view3.php?chapterid=946&run_id=247r15775#1
 */
public class PassHorse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        PassHorse passHorse = new PassHorse(n, m);
        int ways = passHorse.findWaysToFinish();
        System.out.println(ways);

    }

    private Board board;

    public PassHorse(int width, int length) {
        this.board = new Board(width, length);
    }

    public int findWaysToFinish() {
        initFinishCell();
        processRowsFromBottomToTop();
        Cell beginCell = board.getCell(0, 0);
        return beginCell.getWaysToFinishCount();
    }

    private void initFinishCell() {
        int lastRowIndex = board.getWidth() - 1;
        int lastColIndex = board.getLength() - 1;
        Cell finishCell = board.getCell(lastRowIndex, lastColIndex);
        finishCell.addWaysToFinishCount(1);
    }

    private void processRowsFromBottomToTop() {
        for (int row = board.getWidth() - 1; row > 0; row--) {
            processRow(row);
        }
    }

    private void processRow(int row) {
        for (int col = board.getLength() - 1; col > 0; col--) {
            Cell cell = board.getCell(row, col);
            if (cell.getWaysToFinishCount() > 0) {
                processCell(row, col);
            }
        }
    }

    private void processCell(int row, int col) {
        List<Cell> prevCellsToCurrentInPath = findPrevCellsToCurrentInPath(row, col);
        Cell current = board.getCell(row, col);
        for (Cell prevCell : prevCellsToCurrentInPath) {
            prevCell.addWaysToFinishCount(current.getWaysToFinishCount());
        }
    }

    private List<Cell> findPrevCellsToCurrentInPath(int row, int col) {
        Cell cellLeft2Up1 = getCell(row - 1, col - 2);
        Cell cellLeft1Up2 = getCell(row - 2, col - 1);
        List<Cell> prevCells = new ArrayList<Cell>();
        if (cellLeft1Up2 != null) {
            prevCells.add(cellLeft1Up2);
        }
        if (cellLeft2Up1 != null) {
            prevCells.add(cellLeft2Up1);
        }
        return prevCells;
    }

    private Cell getCell(int row, int col) {
        if (row < 0 || col < 0) {
            return null;
        }
        return board.getCell(row, col);
    }
}

class Board {

    private int width;
    private int length;
    private Cell[][] board;

    public Board(int width, int length) {
        this.width = width;
        this.length = length;
        board = new Cell[width][length];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                board[i][j] = new Cell();
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Cell getCell(int row, int col) {
        return board[row][col];
    }
}

class Cell {
    private int waysToFinishCount;

    public void addWaysToFinishCount(int delta) {
        waysToFinishCount += delta;
    }

    public int getWaysToFinishCount() {
        return waysToFinishCount;
    }

}
