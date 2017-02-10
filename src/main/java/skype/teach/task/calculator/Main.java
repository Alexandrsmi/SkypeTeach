package skype.teach.task.calculator;

/**
 *
 */
public class Main {
    public static void main(String[] args) {

        CalculatorModel model = new CalculatorModel();
        new View(model).setVisible(true);
    }
}
//public class ChangeState {
//    public static class Claim {
//        public String name;
//    }
//
//    public static void main(String[] args) {
//        Claim claim = new Claim();
//        claim.name = "bug";
//        processClaim(claim);
//        System.out.println(claim.name);
//    }
//
//    private static void processClaim(Claim value) {
//        value.name = "task";
//    }
//}


