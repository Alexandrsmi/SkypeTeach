package skype.teach.task.lesson3;

/**
 * Created by Александр on 17.01.2017.
 */
public class Turn {
    private int[] mass;

    public Turn() {
        this.mass = new int[]{1, 2, 3};
    }

    public static void main(String[] args) {
        Turn turn = new Turn();

        turn.getBackArray(turn.mass);

//        for (int i = 0; i < array.length; i++) {
//        System.out.print(array[i] + " ");
    }

    public int[] getBackArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp;
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;

        }
        return array;
    }
}