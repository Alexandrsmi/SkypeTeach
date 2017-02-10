package skype.teach.task.recursion.fib.lesson;

import java.util.Scanner;

/**
 *
 */
public class TaskT {
    private int n;
    private int[][] array;

    public TaskT(int n) {
        this.n = n;
        this.array = new int[n][n];
    }

    public static void main(String[] args) {
        int n = enterArray();
        int[][] array = enterArray(n);
        TaskT taskT = new TaskT(n);
        print(array, n);


    }

    public static void print(int[][] array, int n) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int enterArray() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static int[][] enterArray(int size) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        return array;

    }
}

//    public int[][] fill(int[][] mass, int row, int col, int n) {
////        if (row == 0 && col != n - 1) {
////            if (mass[row + 1][col] > mass[row][col + 1]) {
////                mass[row + 1][col] = -1;
////                row++;
////            } else {
////                mass[row][col + 1] = -1;
////            }
////        } else if (row != 0 && row != n - 1 && col == 0) {
////            if (mass[row - 1][col] != -1 && mass[row][col + 1] == -1) {
////                mass[row - 1][col] = -1;
////                row++;
////            } else if (mass[row + 1][col] != -1 && mass[row][col + 1] == -1) {
////                mass[row][col + 1] = -1;
////            }
//////    }
////        }
////    }
//}

