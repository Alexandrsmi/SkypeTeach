package skype.teach.task.rabbit;

import java.util.Scanner;

/**
 *
 */
public class RabbitMain {
    public static void main(String[] args) {
        RabbitInput rabbitInput = RabbitInput.readRabbitInput();
        int n = rabbitInput.getCellsCount();
        int m = rabbitInput.getRabbitCount();
        int r = rabbitInput.getRabbitOfCells(n, m);
        System.out.println(r);
    }

    static class RabbitInput {
        private int cellsCount;
        private int rabbitCount;

        public static RabbitInput readRabbitInput() {
            RabbitInput rabbitInput = new RabbitInput();
            Scanner sc = new Scanner(System.in);
            rabbitInput.cellsCount = sc.nextInt();
            rabbitInput.rabbitCount = sc.nextInt();

            return rabbitInput;
        }

        public int getCellsCount() {
            return cellsCount;
        }

        public int getRabbitCount() {
            return rabbitCount;
        }


        public int getRabbitOfCells(int n, int m) {
            int sum;
            if ((m % n) == 0) {
                sum = (m/n);
            } else {
                sum = (m/n) + 1;
            }
            return sum;
        }
    }
}
