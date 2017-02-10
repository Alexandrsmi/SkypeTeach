package skype.teach.task.recursion.fib.lesson;
import java.util.*;

/**
 *
 */
public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        StackMethod stack = new StackMethod();
        while (!s.equals("exit")) {
            s = enterCommand(sc.next(),sc,stack);
        }
    }

    public static String enterCommand(String command, Scanner sc,StackMethod stack) {
        if (command.equals("push")) {
            int n = sc.nextInt();
            stack.push(n);
        } else if (command.equals("pop")) {
            stack.pop();
        } else if (command.equals("size")) {
            stack.size();
        } else if (command.equals("clean")) {
            stack.clean();
        } else if (command.equals("exit")) {
            stack.exit();
        } else if (command.equals("back")) {
            stack.back();
        }
        return command;
    }
}

class StackMethod {
    Stack stack = new Stack();

    public void push(int n) {
        stack.push(n);
        System.out.println("ok");
    }

    public void pop() {
        System.out.println(stack.peek());
        stack.pop();
    }

    public void size() {
        System.out.println(stack.size());
    }

    public void clean() {
        if (stack.size() == 0) {
            System.out.println("ok");
        } else {
            stack.clear();
            System.out.println("ok");
        }
    }

    public void exit() {
        System.out.println("bye");
    }

    public void back() {
        System.out.println(stack.peek());
    }
}