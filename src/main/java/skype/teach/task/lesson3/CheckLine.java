package skype.teach.task.lesson3;

/**
 * Created by Александр on 22.01.2017.
 */
public class CheckLine {

    public char[] stringInChar(String strings) {
        return strings.toCharArray();
    }


    public boolean checkSubString(char[] ch, char[] p) {
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == p[count]) {
                count++;
                if (ch[i] == p[p.length - 1] && count == p.length) {
                    return true;
                }
            } else {
                count = 0;
            }

        }
        return false;
    }
}
