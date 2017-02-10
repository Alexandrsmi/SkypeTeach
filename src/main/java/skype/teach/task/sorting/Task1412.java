package skype.teach.task.sorting;

import java.util.Scanner;

/**
 * Created by Александр on 18.12.2016.
 */
public class Task1412 {
    private int n;
    private int[][] array;
    private int x;

    public Task1412(int n, int x) {
        this.n = n;
        this.x = x;
        array = new int[n][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        Task1412 task1412 = new Task1412(n, x);

        int[][] array = enterArray(n, sc);
        print(array, n);
        getX(x, 0, 0, array, n, Direction.down);
    }

    public static void getX(int x, int row, int col, int[][] array, int n, Direction direction) {
        if (col != array.length - 1) {
            switch (direction) {
                case down:
                    if (col != n - 1) {
                        if (array[row][col] == x&&col<=array.length-1) {
                            System.out.println("YES");
                            getX(x, 0, col + 1, array, n, Direction.down);
                            break;
                        }
                        getX(x, row + 1, col, array, n, Direction.down);
                        break;
                    }
            }
        }
    }

    public static int[][] enterArray(int size, Scanner sc) {

        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    public static void print(int[][] array, int n) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public enum Direction {
        right, down;
    }
}