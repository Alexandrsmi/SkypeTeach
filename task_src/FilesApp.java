import java.io.*;

public class FilesApp {

    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("E:\\Java programm\\Skype\\SkypeTeach\\task_src\\Cal");
           String string = String.valueOf(fileInputStream);
            System.out.println(string);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
