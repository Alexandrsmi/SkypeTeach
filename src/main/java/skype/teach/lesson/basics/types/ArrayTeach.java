package skype.teach.lesson.basics.types;

/**
 *
 */
public class ArrayTeach {
    public static void main(String[] args) {
        int[] mass = new int[3];
        mass[0] = 10;
        mass[2] = 20;
        System.out.println(mass[1]);
        System.out.println(mass.length);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
        for (int current: mass){
            System.out.println(current);
        }
        String[] mass1 = new String[4];
        String[] mass2 = {"A", "B", "C"};
    }
}
