package skype.teach.task.array;

import java.util.Scanner;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = sc.nextInt();
        }
        System.out.println("");
        int sizeChild = sc.nextInt();

//        for (int i = 0; i < mass.length; i++) {

        for (int i = 1; i < mass.length - 1; i++) {
            if (sizeChild > mass[0]) {
                System.out.println(i);
                break;
            } else if (mass[i - 1] > sizeChild && sizeChild > mass[i]) {
                System.out.println(i + 1);
                break;
            }

        }

    }
}
