package skype.teach.task.time;

import java.util.Scanner;

/**
 *http://informatics.mccme.ru/mod/statements/view3.php?id=1120&chapterid=1483#1
 */
public class TwoMomentsOfTimeMain {
    private int h,n,s;
  public  TwoMomentsOfTimeMain(int h, int n, int s){
        this.h = h;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        if (h < 0 || h > 23){
            h = sc.nextInt();
        }
        int m = sc.nextInt();
        int s = sc.nextInt();
        if (m < 0 || m > 60 || s < 0 || s >60){
             m = sc.nextInt();
             s = sc.nextInt();
        }

        int h2 = sc.nextInt();
        if (h2 < 0 || h > 23 || h2 < h){
            h = sc.nextInt();
        }
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();

            int hs = (h2 - h) * 3600;
            int ms = (m2 - m) * 60;
            int ss = s2 - s;
            int sum = hs + ms + ss;
        System.out.println(sum);

//        HoursMinSecInputController hoursMinSecInputController = new ConsoleHoursMinSecInputController();
//        ProcessingTime processingTime = new ProcessingTime();
//        HoursMinSecOutputController hoursMinSecOutputController = new Clas();
//    }
//
//    interface HoursMinSecInputController {
//        byte enterValueTime();
//    }
//
//    static class ConsoleHoursMinSecInputController implements HoursMinSecInputController {
//        public byte enterValueTime() {
//            Scanner sc = new Scanner(System.in);
//            return sc.nextByte();
//        }
//    }
//
//    interface HoursMinSecOutputController {
//        void writeSeconds(Byte[] seconds);
//    }
//
//    static class Clas implements HoursMinSecOutputController {
//
//
//        public void writeSeconds(Byte[] seconds) {
//            System.out.println(seconds);
//        }
//    }
//
//    static class ProcessingTime {
////
//        public Byte[] S() {
//            HoursMinSecInputController hoursMinSecInputController = new ConsoleHoursMinSecInputController();
//             byte hours = hoursMinSecInputController.enterValueTime();
//            byte min = hoursMinSecInputController.enterValueTime();
//            byte sec = hoursMinSecInputController.enterValueTime();
//
//            byte hours2 = hoursMinSecInputController.enterValueTime();
//            byte min2 = hoursMinSecInputController.enterValueTime();
//            byte sec2 = hoursMinSecInputController.enterValueTime();
//
//            int h = (hours2 - hours) * 3600;
//            int m = (min2 - min) * 60;
//            int s = sec2 - sec;
//            int sum = h + m + s;

    }
}
