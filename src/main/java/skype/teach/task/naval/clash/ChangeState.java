package skype.teach.task.naval.clash;

/**
 * Created by Александр on 20.12.2016.
 */
public class ChangeState {
    public static class Claim {
        public String name;
    }

    public static void main(String[] args) {
        Claim claim = new Claim();
        claim.name = "bug";
        processClaim(claim);
        System.out.println(claim.name);
    }

    private static void processClaim(Claim value) {
        value.name = "task";
    }
}