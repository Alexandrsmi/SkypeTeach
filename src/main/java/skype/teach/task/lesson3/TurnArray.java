package skype.teach.task.lesson3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Александр on 17.01.2017.
 */
public class TurnArray {


    public int[][] getTurnArray(int[][] array) {
        int[][] reverseArray = new int[array.length][array.length];
        for (int i = 0; i < reverseArray.length; i++) {
            for (int j = 0; j < reverseArray.length; j++) {
                reverseArray[j][reverseArray.length - 1 - i] = array[i][j];
            }
        }return reverseArray;
    }
}