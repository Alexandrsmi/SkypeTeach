package skype.teach.task.days.days.enm;

import skype.teach.task.days.days.enm.output.ConsoleDayOutputController11;
import skype.teach.task.days.days.enm.output.DayOutputController1;
import skype.teach.task.days.input.ConsoleDayInputController;
import skype.teach.task.days.input.DayInputController;

/**
 *
 */
public class DaysMain {
    public static void main(String[] args) {
        DayInputController dayInputController = new ConsoleDayInputController();
        DayOutputController1 dayOutputController1 = new ConsoleDayOutputController11();
        int dayNumber = dayInputController.enterDayNumber();

        EnumDay day = EnumDay.getByNumber(dayNumber);
        dayOutputController1.writeDayName(day);

        String dayName = dayInputController.enterDayName();
        day = EnumDay.getByNextDayName(dayName);
        dayOutputController1.writeDayName(day);

        day = EnumDay.getByPreviousDayName(dayName);
        dayOutputController1.writeDayName(day);

        dayNumber = EnumDay.getByName(dayName);
        dayOutputController1.writeDayNumber(dayNumber);


    }
}

