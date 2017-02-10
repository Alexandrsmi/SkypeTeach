package skype.teach.task.recursion.fib.lesson;


import java.util.Scanner;

/**
 *http://informatics.mccme.ru/mod/statements/view3.php?id=20653&chapterid=1470#1
 */
public class TaskX {
    private int n;
    private int[][] array;
    private int maxN;

    public TaskX(int n) {
        array = new int[n][n];
        this.n = n;
        maxN = n * n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TaskX taskD = new TaskX(n);
        taskD.fill();
        taskD.print();
    }

    public void fill() {
        fill(0, 0, Direction.right, 1);
    }

    private void fill(int row, int col, Direction direction, int n) {
        array[row][col] = n;
        if (n != maxN) {
            switch (direction) {
                case right:
                    if (col == this.n - 1 || array[row][col + 1] != 0) {
                        fill(row + 1, col, Direction.down, n + 1);
                    } else {
                        fill(row, col + 1, Direction.right, n + 1);
                    }
                    break;
                case left:
                    if (col == 0 || array[row][col - 1] != 0) {
                        fill(row - 1, col, Direction.up, n + 1);
                    } else {
                        fill(row, col - 1, Direction.left, n + 1);
                    }
                    break;
                case up:
                    if (row == 0 || array[row - 1][col] != 0) {
                        fill(row, col + 1, Direction.right, n + 1);
                    } else {
                        fill(row - 1, col, Direction.up, n + 1);
                    }
                    break;
                case down:
                    if (row == this.n - 1 || array[row + 1][col] != 0) {
                        fill(row, col - 1, Direction.left, n + 1);
                    } else {
                        fill(row + 1, col, Direction.down, n + 1);
                    }
                    break;
            }
        }
    }

    public void print() {
        print(0, 0);
    }

    private void print(int row, int col) {
        System.out.print(array[row][col]);
        if (row != this.n - 1 || col != this.n - 1) {
            if (col == this.n - 1) {
                System.out.println();
                print(row + 1, 0);
            } else {
                System.out.print(" ");
                print(row, col + 1);
            }
        }
    }

    public enum Direction {
        right, left, up, down;
    }
}
