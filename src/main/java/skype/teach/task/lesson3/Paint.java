package skype.teach.task.lesson3;

/**
 * Created by Александр on 17.01.2017.
 */
public class Paint {
    private String a = " ";
    private String b = "^";
    private int h;

    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.getPiramid(5);
    }

    public void getPiramid(int h) {
        int count = 0;
        int temp = h;
        for (int i = 0; i <= h - 1; i++) {
            for (int j = 0; j <= temp-2; j++) {
                System.out.print(a);
            }
            temp--;
            System.out.print(b);
            if (count == 0) {
                System.out.println();
            }
            for (int z = 0; z < count; z++) {
                System.out.print(a);

            }
            if (count > 0) {
                System.out.println(b);
            }
            count++;
        }
    }
}
