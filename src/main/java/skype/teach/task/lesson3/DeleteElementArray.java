package skype.teach.task.lesson3;

import java.util.Arrays;

/**
 * Created by Александр on 22.01.2017.
 */
public class DeleteElementArray {
    private String[] strings = {"a", "a", "b", "b", "b", "c", "b", "f", "u", "da"};

    public static void main(String[] args) {
        DeleteElementArray array = new DeleteElementArray();
        String[] s = array.deletionNullInArray(array.sortNullTheElementsArray(
                array.allocNullToDuplicatingElements(array.strings)));
        for (String ar : s) {
            System.out.print(ar + " ");
        }

    }

    public String[] allocNullToDuplicatingElements(String[] strings) {
        for (int i = strings.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (strings[i] == strings[j]) {
                    strings[j] = null;
                }
            }
        }
        return strings;
    }

    public String[] sortNullTheElementsArray(String[] strings) {
        int count = 0;
        for (int i = strings.length - 1; i >= count; ) {
            if (strings[count] == null) {
                String tem;
                tem = strings[i];
                strings[i] = strings[count];
                strings[count] = tem;
                i--;
            }
            count++;
        }
        return strings;
    }

    public String[] deletionNullInArray(String[] strings) {
        int countNull = 0;
        for (String ar : strings) {
            if (ar == null) {
                countNull++;
            }
        }
        String[] arrayCopy = Arrays.copyOf(strings, (strings.length) - countNull);

        return arrayCopy;
    }
}
