package skype.teach.task.factorial;

import skype.teach.task.factorial.input.ConsoleValueInputController;
import skype.teach.task.factorial.input.ValueInputController;
import skype.teach.task.factorial.output.ConsoleValuOutputController;
import skype.teach.task.factorial.output.ValueOutputController;

import java.util.Scanner;

/**
 *
 */
public class FactorialMain {
    public static void main(String[] args) {

        ValueInputController valueInputController = new ConsoleValueInputController();
        long value = valueInputController.enterValue();

        FactorialFor factorialFor = new FactorialFor(value);
        FactorialWhile factorialWhile = new FactorialWhile(value);
        FactorialDoWhile factorialDoWhile = new FactorialDoWhile(value);

        ValueOutputController valueOutputController = new ConsoleValuOutputController();
        value = factorialDoWhile.getFactorial();
        valueOutputController.writeValue(value);
        value = factorialFor.getFactorial();
        valueOutputController.writeValue(value);
        value = factorialWhile.getFactorial();
        valueOutputController.writeValue(value);


//        Factorial Factorial = factorialFor;
//        printAd(Factorial);
//        Factorial = factorialWhile;
//        printAd(Factorial);
//        Factorial = factorialDoWhile;
//        printAd(Factorial);
//        printAd(Factorial);
//
//
//    }
//
//    public static void printAd(Factorial Factorial) {
//
//        System.out.println("Factorial " + " = " + Factorial.getFactorial());
//    }

//    public static long addValueFac() {
//        Scanner sc = new Scanner(System.in);
//        long temp = sc.nextInt();
//        return temp;
//    }

    }
}