package skype.teach.task.lesson3;

/**
 * Created by Александр on 17.01.2017.
 */
public class BubblesSort {


    public int[] getBubbleSortArray(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int temp = array[j];
                if (temp > array[j + 1]) {
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
