/* Составить программу для вычисления значений функции F(x) на отрезке [a, b] с шагом h.
   Результат представить в виде таблицы, первый столбец которой - значения аргумента, второй - соответствующие значения фукции.
   F(x) = tg(2*x) - 3;
 */

public class HomeTask_3 {
    public static void main(String[] args) {
        double a = 1;
        double b = 10;
        double h = 0.5;
        double x;

        for (x = a; x <= b; x += h) {
            System.out.println(x + "\t" + (Math.tan(2 * x) - 3)); // выражение под tan в радианах;
        }
    }
}
