import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.util.DoubleSummaryStatistics;
import java.util.Random;

/* Даны действительные числа a_1, a_2, ..., a_2n.
   Найти max(a_1 + a_2n, a_2, a_2m-1, ... , a_n + a_n+1);
 */
public class HomeTask_4 {
    public static void main(String[] args) {
        double[] a;
        double[] sum_a;
        double max = Double.NEGATIVE_INFINITY;
        int n = 50;

        a = new double[2 * n];
        sum_a = new double[n];

        Random r = new Random();

        for (int i = 0; i < 2 * n; i++) {
            // a[i] = r.nextDouble();
            a[i] = (Double.MIN_VALUE / 2 + 1) + r.nextDouble() * ((Double.MAX_VALUE / 2 - 1) - (Double.MIN_VALUE / 2 + 1)); // с математической точки зрения это более верно, поскольку диапазон действительных чисел шире чем [0, 1);
            // System.out.println(i + " " + a[i]);
        }

        for (int i = 0; i < n; i++) {
            sum_a[i] = a[i] + a[2*n - 1 - i];

            if (sum_a[i] > max) max = sum_a[i];
        }

        System.out.println(max);
    }
}
