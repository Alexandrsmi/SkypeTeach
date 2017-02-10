package skype.teach.task.array.mass;


import skype.teach.task.array.mass.input.ConsoleValuesInputController;
import skype.teach.task.array.mass.input.ValuesInputController;

/**
 *
 */
public class ArrayMain {
    public static void main(String[] args) {
        ValuesInputController valuesInputController = new ConsoleValuesInputController();
        int size = valuesInputController.enterValue();
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = valuesInputController.enterValue();
        }

        TaskMethod taskMethod = new TaskMethod();
        taskMethod.taskA(mass);
        taskMethod.taskB(mass);
        taskMethod.taskC(mass);
        taskMethod.taskD(mass);
        taskMethod.taskE(mass);
        taskMethod.taskF(mass);
        taskMethod.taskG(mass);
        taskMethod.taskH(mass);
        taskMethod.taskI(mass);
        taskMethod.taskJ(mass);
        taskMethod.taskL(mass, valuesInputController.enterValue());
    }

    static class TaskMethod {
        public void taskA(int[] mass) {
            for (int i = 0; i < mass.length; i += 2) {
                System.out.print(mass[i] + " ");
            }
            System.out.println();
        }

        public void taskB(int[] mass) {
            for (int i = 0; i < mass.length; i++) {
                if ((mass[i] % 2) == 0) {
                    System.out.print(mass[i] + " ");
                }
            }
            System.out.println();
        }

        public void taskC(int[] mass) {
            int b = 0;
            for (int i = 0; i < mass.length; i++) {
                if (mass[i] > 0) {
                    ++b;
                }
            }
            System.out.println(b);
        }

        public void taskD(int[] mass) {
            int b = 0;
            for (int i = 0; i < mass.length - 1; i++) {

                if (mass[i] < mass[i + 1]) {
                    ++b;
                }
            }
            System.out.println(b);
        }

        public void taskE(int[] mass) {
            for (int i = 1; i < mass.length; i++) {
                if (mass[i] > 0 && mass[i - 1] > 0 || mass[i] < 0 && mass[i - 1] < 0) {
                    System.out.println("YES");
                    return;
                }
            }
            System.out.println("NO");
        }

        public void taskF(int[] mass) {
            int b = 0;
            for (int i = 1; i < mass.length - 1; i++) {
                if (mass[i - 1] < mass[i] && mass[i] > mass[i + 1]) {
                    b++;
                }
            }
            System.out.println(b);
        }

        public void taskG(int[] mass) {
            for (int i = 0; i < mass.length / 2; i++) {
                int temp;
                temp = mass[i];
                mass[i] = mass[(mass.length - 1) - i];
                mass[(mass.length - 1) - i] = temp;
            }
            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[i] + " ");
            }
            System.out.println();
        }

        public void taskH(int[] mass) {
            for (int i = 0; i < mass.length - 1; i += 2) {
                int temp;
                temp = mass[i];
                mass[i] = mass[i + 1];
                mass[i + 1] = temp;
            }
            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[i] + " ");
            }
            System.out.println();
        }

        public void taskI(int[] mass) {
            for (int i = 0; i <= mass.length - 1; i++) {
                int temp;
                temp = mass[i];
                mass[i] = mass[mass.length - 1];
                mass[mass.length - 1] = temp;
            }
            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[i] + " ");
            }
            System.out.println();
        }

        public void taskJ(int[] mass) {
            for (int i = 0; i < mass.length; i++) {
                if (mass[0] < mass[i]) {
                    mass[0] = mass[i];
                }
            }
            System.out.println(mass[0]);
        }

        public void taskK(int[] mass) {
            int temp = 1;
            for (int j = 1; j < mass.length; j++) {
                if (mass[j - 1] < mass[j]) {
                    temp++;
                }
            }
            System.out.println(temp);
        }

        public void taskL(int[] mass, int sizeChild) {
            for (int i = 1; i < mass.length - 1; i++) {
                if (mass[i - 1] > sizeChild && sizeChild > mass[i]) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}