package skype.teach.task.sorting;

import java.util.Scanner;

/**
 * http://informatics.mccme.ru/mod/statements/view3.php?id=270&chapterid=223
 */
public class TaskA {
    private int n;
    private int[] array;

    public TaskA(int n, int[] array) {
        this.n = n;
        this.array = array;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = enterArray(n, sc);
        int x = sc.nextInt();
        print(array, x);
    }

    public static int[] enterArray(int size, Scanner sc) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static void print(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
