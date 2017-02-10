package skype.teach.task.lesson3;

/**
 * Created by Александр on 16.01.2017.
 */
public class Max {

    public static void main(String[] args) {
        Max max = new Max();
        int r = max.max(4, 3, 7);
        System.out.println(r);
    }

    public int max(int first, int second) {
        return first > second ? first : second;
    }

    public int max(int first, int second, int third) {
        if (max(first, second) > third) {
            return max(first, second);
        } else {
            return third;
        }
//        int temp = max(first, second);
//        int max = temp > third ? temp : third;
//    return max;

    }
}
