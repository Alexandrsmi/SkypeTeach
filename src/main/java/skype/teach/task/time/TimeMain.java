package skype.teach.task.time;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *http://informatics.mccme.ru/mod/statements/view3.php?id=1120&chapterid=1475#1
 */
public class TimeMain {
    public static void main(String[] args) {
       InputSecController inputSecController = new ConsoleTimeInputController();
        int value = inputSecController.enterValueOfTimeInSec();
        DeterminationTime determinationTime = new DeterminationTime();
        int hours = determinationTime.getDeterminationHours(value);
        int min = determinationTime.getDeterminationMin(value);
        OutputTimeController outputTimeController = new ConsoleOutTimeController();
        outputTimeController.writeTime(hours,min);

    }

     static class DeterminationTime {

        public  int getDeterminationHours(int value) {
           int hours = value / 3600;
//            TimeUnit.HOURS.convert(value,TimeUnit.SECONDS);
            return hours;
        }
        public int getDeterminationMin (int value) {
               int min = ((value) - (getDeterminationHours(value) * 3600)) / 60;
          return min;
        }
    }

    public interface InputSecController {
        int enterValueOfTimeInSec();
    }

    static class ConsoleTimeInputController implements InputSecController {

        public int enterValueOfTimeInSec() {
            Scanner sc = new Scanner(System.in);
            int temp = sc.nextInt();
            while (temp < 0 || temp > 86399){
               temp = sc.nextInt();
            }
            return temp;
        }
    }

    public interface OutputTimeController {
        void writeTime(int hours, int min);
    }

    static class ConsoleOutTimeController implements OutputTimeController {

        public void writeTime(int hours, int min) {
            System.out.println("It is" + " " + hours +
                    " " + "hours" + " " + min + " " + "minutes.");
        }
    }
}
