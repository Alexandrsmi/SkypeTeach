import java.util.Scanner;
import java.util.Stack;

/**
 *
 */
public class StackTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        StackCommand stackCommand;
        StackCommandFactory stackCommandFactory = new StackCommandFactory();
        do {
            String commandName = sc.next();
            stackCommand = stackCommandFactory.getStackCommand(commandName);
            String result = stackCommand.execute(stack, sc);
            System.out.println(result);
        } while (!stackCommand.isFinish());
    }

}

class StackCommandFactory {
    private StackCommand[] commands = {
            new PopStackCommand(),
            new PushStackCommand(),
            new SizeStackCommand(),
            new BackStackCommand(),
            new ClearStackCommand(),
            new ExitStackCommand()
    };

    public StackCommand getStackCommand(String commandName) {
        for (StackCommand command : commands) {
            if (commandName.equals(command.getName())) {
                return command;
            }
        }
        return null;
    }
}

interface StackCommand {
    String getName();

    String execute(Stack<String> stack, Scanner sc);

     boolean isFinish();
}
abstract class NotFinishStackCommand implements StackCommand{
    @Override
    public boolean isFinish() {
        return false;
    }
}

class PopStackCommand extends NotFinishStackCommand{
    @Override
    public String getName() {
        return "pop";
    }

    @Override
    public String execute(Stack<String> stack, Scanner sc) {
        return stack.pop();
    }
}
class PushStackCommand extends NotFinishStackCommand{
    @Override
    public String getName() {
        return "push";
    }

    @Override
    public String execute(Stack<String> stack, Scanner sc) {
        stack.push(sc.next());
        return "ok";
    }
}
class SizeStackCommand extends NotFinishStackCommand{
    @Override
    public String getName() {
        return "size";
    }

    @Override
    public String execute(Stack<String> stack, Scanner sc) {
        return String.valueOf(stack.size());
    }
}
class BackStackCommand extends NotFinishStackCommand{
    @Override
    public String getName() {
        return "back";
    }

    @Override
    public String execute(Stack<String> stack, Scanner sc) {
        return stack.peek();
    }
}
class ClearStackCommand extends NotFinishStackCommand{
    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String execute(Stack<String> stack, Scanner sc) {
        stack.clear();
        return "ok";
    }
}
class ExitStackCommand implements StackCommand{
    @Override
    public String getName() {
        return "exit";
    }

    @Override
    public String execute(Stack<String> stack, Scanner sc) {
        return "bye";
    }

    @Override
    public boolean isFinish() {
        return true;
    }
}