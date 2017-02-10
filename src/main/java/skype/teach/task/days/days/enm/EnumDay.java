package skype.teach.task.days.days.enm;


/**
 *
 */
public enum EnumDay {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;


    public static EnumDay getByNumber(int dayNumber) {
        EnumDay[] values = EnumDay.values();
        for (EnumDay value : values) {
            if (value.ordinal() + 1 == dayNumber ) {
                return value;
            }
        }
        return null;
    }

    public static int getByName(String name) {
        EnumDay[] values = EnumDay.values();
        for (EnumDay value : values) {
            if (value.name().equals(name)) {
                return value.ordinal() + 1;
            }
        }
        return 0;
    }

    public static EnumDay getByNextDayName(String name) {
        EnumDay[] values = EnumDay.values();
        for (EnumDay value : values) {
            if (value.name().equals(name)) {
                if (value.ordinal() == values.length - 1) {
                    return values[0];
                }
                return values[value.ordinal() + 1];
            }
        }
        return null;
    }

    public static EnumDay getByPreviousDayName(String name) {
        EnumDay[] values = EnumDay.values();
        for (EnumDay value : values) {
            if (value.name().equals(name)) {
                if (value.ordinal() == 0) {
                    return values[values.length - 1];
                }
                return values[value.ordinal() - 1];
            }
        }
        return null;
    }
}
