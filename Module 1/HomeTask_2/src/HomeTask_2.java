/* Найти наименьший номер элемента последовательности, для которого выполняется условие M.
   Вывести на экран номер этого элемента и все элементы a_i, где i = 1, 2, ... r;
   a_n = 1/(n + 1)^2, M : a_n < epsilon.
 */

public class HomeTask_2 {
    public static void main(String[] args) {
        int r = 100;
        double eps = 0.0005;
        boolean flag = true;
        double a;

        for (int i = 1; i <= r; i++) {
            a = 1 / Math.pow((i + 1), 2);

            if (a < eps) {
                if (flag) {
                    System.out.println("Наименьший элемент последовательности, для которого выполняется условие M: " + i);
                    flag = false;
                }
                System.out.println("a_"+ i + " : " + a);
            }
        }
    }
}
