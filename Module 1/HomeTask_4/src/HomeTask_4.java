import java.util.Random;

/* Даны действительные числа a_1, a_2, ..., a_2n.
   Найти max(a_1 + a_2n, a_2, a_2m-1, ... , a_n + a_n+1);
 */
public class HomeTask_4 {
    public static void main(String[] args) {
        double[] a;
        double[] sum_a;
        double max = Double.NEGATIVE_INFINITY;
        int n = 1000000;
        double sign_a;

        a = new double[2 * n];
        sum_a = new double[n];

        Random r = new Random();

        for (int i = 0; i < 2 * n; i++) {
            sign_a = r.nextBoolean() ? 1.0 : -1.0;
            //a[i] = sign_a * r.nextDouble();
            a[i] = sign_a * (1E6 * r.nextDouble());
            //System.out.println(i + " " + a[i]);
        }

        for (int i = 0; i < n; i++) {
            sum_a[i] = a[i] + a[2 * n - 1 - i];

            if (sum_a[i] > max) max = sum_a[i];
        }

        System.out.println(max);
    }
}
