package skype.teach.task.recursion.fib.lesson;

import java.util.Scanner;

/**
 * http://informatics.mccme.ru/mod/statements/view3.php?id=253&chapterid=155#1
 */
public class Generator {
    private int n;
    private int k;
    private int[][] array;
    private int maxN;
    private int count =0;

    public Generator(int n, int k) {
        this.n = n;
        this.k = k;
        array = new int[k * k][n];
        maxN = k * k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Generator generator = new Generator(n, k);
        generator.recursion();
        generator.print();
    }

    public void recursion() {
        recursion(0, 0, 1);
        recursion(0, 1, 1, 1);
    }

    public void recursion(int row, int col, int n) {

        array[row][col] = n;
        if (row != maxN) {

            if (count == k) {
                count = 1;
                recursion(row + 1, 0, n + 1);
            } else if (row != (k * k) - 1) {
                count++;
                recursion(row + 1, 0, n);
            }
        }
    }
/*n = 3 , k 4 :
      1 1 1
      1 1 2
      1 1 3
      1 1 4
      1 2 1
      1 2 2
      1 2 3
      1 2 4
      1 3 1
 */
    public void recursion(int row, int col, int n, int b) {
        array[row][col] = n;
        if (b != maxN * (this.n - 1)) {
            if (col != this.n - 1) {
                recursion(row, col + 1, n, b + 1);
            } else {
                if (n == k) {
                    n = 0;
                }
                recursion(row + 1, 1, n + 1, b + 1);
            }
        }
    }

    public void print() {
        print(0, 0, 1);
    }

    private void print(int row, int col, int c) {
        if (row != maxN) {
            if (col != n) {
                System.out.print(array[row][col]);
            }
            if (col != n) {
                System.out.print(" ");
                print(row, col + 1, c + 1);
            } else {
                System.out.println("");
                print(row + 1, 0, c + 1);
            }
        }
    }
}