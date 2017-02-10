package skype.teach.task.calculator.oop;

/**
 *
 */
public class Calculate {
    private double result;

    public double getResult() {
        return result;
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        calculate.getSum(2, 2);
        System.out.println(calculate.getResult());
    }

    public Calculate() {
        this.result = result;
    }

    public void getSum(double first, double second) {
        this.result = first + second;
    }
    public void getSub(double first, double second) {
        this.result = first - second;
    }

    public void getDiv(double first, double second) {
        this.result = first / second;
    }

    public void getMul(double first, double second) {
        this.result = first * second;
    }
}
