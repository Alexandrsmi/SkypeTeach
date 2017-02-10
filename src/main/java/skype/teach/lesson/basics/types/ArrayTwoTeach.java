package skype.teach.lesson.basics.types;

import javax.swing.*;

/**
 *
 */
public class ArrayTwoTeach {
    public static void main(String[] args) {
        ArrayTwoTeach arrayTwoTeach = new ArrayTwoTeach();
        String[][] array = new String[5][];
        array[0] = new String[2];
        array[1] = new String[3];
        System.out.println(array[1].length);
        array[1][2] = "dad";
        String[] strings = array[0];
        strings[1] = "Daw";
        System.out.println(array[0][1]);
        array[1][2] = arrayTwoTeach.input();
        System.out.println( array[1][2]);

    }

    private String input() {
        String strings;
        strings = "Hit";
        return strings;    }
}
