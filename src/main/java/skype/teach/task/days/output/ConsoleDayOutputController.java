package skype.teach.task.days.output;

import skype.teach.task.days.days.enm.EnumDay;

/**
 *
 */
public class ConsoleDayOutputController implements DayOutputController {

    public void writeDayName(String dayName) {
        System.out.println(dayName);
    }
    public void writeDayNumber(int dayNumber) {
        System.out.println(dayNumber);
    }
}
