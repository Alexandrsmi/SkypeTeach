package skype.teach.lesson.basics.types;

/**
 *
 */
public class ScopeTeach {
    public static void main(String[] args) {
        int x = 10;
        {
            System.out.println(x);
            int y = 20;
            {
                int z = 30;

            }
            {
                int z = 40;
            }
        }
        if (true){
            int y = 50;
        }

    }
    public static void f(){
        System.out.println();
    }
}
