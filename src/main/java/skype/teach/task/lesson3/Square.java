package skype.teach.task.lesson3;

/**
 * Created by Александр on 20.01.2017.
 */
public class Square {
    public static int[] remove(int[] arr, int match) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != match)
                arr[i++] = arr[j];
        }
        while (i < arr.length) {
            arr[i++] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 6, 6, 2, 4, 8, 1, 3, 4, 7, 8};
        A = remove(A, 3);
        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}