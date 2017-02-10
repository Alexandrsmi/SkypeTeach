package skype.teach.lesson.basics.types;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 */
public class ExceptionTeach {
    public static void main(String[] args) {

        Throwable throwable = null;
        Error error = null;
        Exception exception = new Exception();


        RuntimeException runtimeException = new RuntimeException();
//        throw exception;
        try {
            processFile("fsa");
            System.out.println("ChangeState Success");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("ChangeState catch: " + e.getMessage());
        }
        System.out.println("ChangeState finish");
    }

    public static void openFile(String filename) throws FileNotFoundException, NullPointerException, IOException {
        new FileInputStream(filename);
    }

    public static void processFile(String filename) throws FileNotFoundException {
        try {
            System.out.println("Try");
            openFile(filename);
            System.out.println("Success");
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println("Catch1");
            throw e;
        } catch (IOException e) {
            System.out.println("Catch2");
        } finally {
            System.out.println("Finally");
        }
//Порядок catch блоков, finally
    }
}
class LoginDoesNotExistException extends Exception{
    public LoginDoesNotExistException(String login) {
        super(login);
    }

    public LoginDoesNotExistException(String login, Throwable cause) {
        super("login does not exist: " + login , cause);
    }
}
