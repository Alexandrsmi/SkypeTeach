package skype.teach.task.days.days.enm;

/**
 *
 */
public class DayWeekFinder {
    private String[] week;

    public DayWeekFinder() {
        week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
    }

    public String getNameByDayNumber(int dayNumber) {
        return week[dayNumber - 1];
    }

    public String getPreviousDay(int dayNumber) {
        if ((dayNumber - 2) < 0) {
            return week[dayNumber + 5];
        }
        return week[dayNumber - 2];
    }

    public String getNextDay(int dayNumber) {

        if ((dayNumber) >= 7) {
            return week[0];
        }
        return week[dayNumber];
    }

    public int getNumberByDayName(String dayName) {
        for (int i = 0; i < week.length; i++) {
            if (week[i].equals(dayName)) {
                return ++i;
            }
        }
        return 0;
    }


}