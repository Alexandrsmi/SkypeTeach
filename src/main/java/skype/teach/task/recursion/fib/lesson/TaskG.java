package skype.teach.task.recursion.fib.lesson;

import java.util.Scanner;

/**
 * http://informatics.mccme.ru/mod/statements/view3.php?id=20653&chapterid=112212#1
 */
public class TaskG {


    private int size;
    private int[] array;


    public static void main(String[] args) {
        TaskG taskG = new TaskG();
        int a = new Scanner(System.in).nextInt();
        taskG.size = getSizeArray(a);
        taskG.array = getArray(a, taskG.size);
        int quantityEvenNumber = getQuantityEvenNumber(taskG.array);
        System.out.println(quantityEvenNumber);
    }

    public static int getQuantityEvenNumber(int[] array) {
        int count = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] getArray(int a, int size) {
        int[] array = new int[size];
        for (int i = 0; i <= array.length - 1; i++) {
            array[(array.length - 1) - i] = a % 10;
            a /= 10;
        }
        return array;
    }

    public static int getSizeArray(int a) {
        int count = 0;
        while (a > 0) {
            a /= 10;
            count++;
        }
        return count;
    }
}