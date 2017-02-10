package skype.teach.task.array.mass.input;

import java.util.Scanner;

/**
 *
 */
public class ConsoleValuesInputController implements ValuesInputController {

    @Override
    public int enterValue() {
       Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}

