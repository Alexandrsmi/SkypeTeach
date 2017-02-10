package skype.teach.task.factorial.input;

import java.util.Scanner;

/**
 *
 */
public class ConsoleValueInputController implements ValueInputController  {

    public long enterValue() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLong();
    }
}
