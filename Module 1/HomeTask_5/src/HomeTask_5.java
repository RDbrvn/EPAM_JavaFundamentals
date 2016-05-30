/* Получить матрицу в которой на главной и побочной диагонали стоят единицы, а в остальных местах 0;
 */
public class HomeTask_5 {
    public static void main(String[] args) {
        int[][] m;
        int n = 10;

        m = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = (i == j) | (i == n - 1 - j) ? 1 : 0;
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
