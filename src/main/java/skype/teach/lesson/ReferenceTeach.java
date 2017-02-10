package skype.teach.lesson;

/**
 *
 */
public class ReferenceTeach {
    public static void main(String[] args) {
        Object o = new Object();
//        Object o2 = o;
        Object o2 = new Object();
//        o2 = null;
        System.out.println(o + "\n" + o2 + "\n");

       Object temp;

            temp = o2;
            o2 = o;
            o = temp;

        System.out.println(o + "\n" + o2);

    }
}
