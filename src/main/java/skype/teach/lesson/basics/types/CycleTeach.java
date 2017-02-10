package skype.teach.lesson.basics.types;

/**
 *
 */
public class CycleTeach {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }

        boolean done = false;

        while (!done){
            System.out.println(done);
        }
        for (;!done;){
            System.out.println(done);
        }
        do{

        }while (done);
    }
}
