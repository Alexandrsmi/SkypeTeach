package skype.teach.task.days.days.enm.input;

import java.util.Scanner;

/**
 *
 */
public class ConsoleDayInputController implements DayInputController {

    public int enterDayNumber() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public String enterDayName() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
