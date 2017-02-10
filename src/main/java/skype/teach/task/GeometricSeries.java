package skype.teach.task;

import java.util.Scanner;

/**
 *
 */
public class GeometricSeries {
    private int startValue;
    private int path;
    private int a;

    public GeometricSeries(int startValue, int path, int a) {
        this.startValue = startValue;
        this.path = path;
        this.a = a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        GeometricSeries geometricSeries = new GeometricSeries(i, n, a);
        geometricSeries.getGeometricSeries();
    }

    public void getGeometricSeries() {
        getGeometricSeries(startValue, path, a, 1);
    }

    private static void getGeometricSeries(int startValue, int path, int a, int counter) {
        if (a == 1) {
            System.out.println(startValue);
            return;
        } else if (a != counter) {
            getGeometricSeries(startValue * path, path, a, counter + 1);
        } else if (a == counter) {
            System.out.println(startValue);
            return;
        }
    }
}
