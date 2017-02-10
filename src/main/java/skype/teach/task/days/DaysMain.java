package skype.teach.task.days;

import skype.teach.task.days.input.ConsoleDayInputController;
import skype.teach.task.days.input.DayInputController;
import skype.teach.task.days.output.ConsoleDayOutputController;
import skype.teach.task.days.output.DayOutputController;

/**
 *
 */
public class DaysMain {
    public static void main(String[] args) {
        DayInputController dayInputController = new ConsoleDayInputController();
        int dayNumber = dayInputController.enterDayNumber();
        DayWeekFinder weekDay = new DayWeekFinder();
        String dayName = weekDay.getNameByDayNumber(dayNumber);
        DayOutputController dayOutputController = new ConsoleDayOutputController();
        dayOutputController.writeDayName(dayName);
        dayName = weekDay.getPreviousDay(dayNumber);
        dayOutputController.writeDayName(dayName);
        dayName = weekDay.getNextDay(dayNumber);
        dayOutputController.writeDayName(dayName);

        dayName = dayInputController.enterDayName();
        dayNumber = weekDay.getNumberByDayName(dayName);
        dayOutputController.writeDayNumber(dayNumber);

    }
}
