package skype.teach.task.lesson3;

import skype.teach.lesson.basics.types.StringTeach;

/**
 * Created by Александр on 20.01.2017.
 */
public class DeleteCopyAyrray {
    private String[] array = new String[]{"Привет","Мир","Мир"};

    public static void main(String[] args) {
        DeleteCopyAyrray deleteCopyAyrray = new DeleteCopyAyrray();
       String[] ar = deleteCopyAyrray.delete(deleteCopyAyrray.array);

        for (String string:ar){
            System.out.println(string);
        }
    }
    /**
     * Delete duplicates
     */
    public String[] delete(String[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            if(values[i]!= null) {
                for (int j = i + 1; j < values.length; j++) {
                    if (values[i].equals(values[j])) {
                        for (int k = j; k < values.length - 1; k++) {
                            values[k] = values[k + 1];
                        }
                        values[values.length - 1] = null;
                    }
                }
            } else break;
        }
        return values;
    }
}

