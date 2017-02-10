package skype.teach.task.array;

import java.util.Scanner;

/**
 *
 */
public class MassiveMain {
    public static void main(String[] args) {
        Mass mass = new Mass();
        mass.write();
    }
}

class Mass {
    SizeInputMassive sizeInputMassive = new ConsoleInputSize();

    int size = sizeInputMassive.enterSize();
    private int[] mass;

    public Mass() {
        mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sizeInputMassive.enterSize();
        }
    }

    public void write() {
        for (int i = 0; i < mass.length; i+=2) {
                System.out.print(mass[i] + " ");

        }
    }

    interface SizeInputMassive {
        public int enterSize();
    }

    class ConsoleInputSize implements SizeInputMassive {

        public int enterSize() {
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();
        }
    }
}

