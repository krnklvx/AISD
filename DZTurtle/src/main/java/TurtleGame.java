import java.util.Scanner;

public class TurtleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кол-во строк: ");
        int n = scanner.nextInt();
        System.out.println("Кол-во столбцов: ");
        int m = scanner.nextInt();
        int[][] field = new int[n][m];
        System.out.println("Цена каждой клетки(заполняется слева направо): ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                field[i][j] = scanner.nextInt();
            }
        }

        int[][] minDist = new int[n][m];
        minDist[0][0] = field[0][0];
        for (int j = 1; j < m; j++) { //первая строка
            minDist[0][j] = minDist[0][j - 1] + field[0][j];
        }

        for (int i = 1; i < n; i++) { //первый столбец
            minDist[i][0] = minDist[i - 1][0] + field[i][0];
        }

        for (int i = 1; i < n; i++){
            for (int j = 1; j < m; j++){
                minDist[i][j] = Math.min(minDist[i - 1][j], minDist[i][j - 1]) + field[i][j];
            }
        }
        System.out.println("Минимальная сумма пути: " + minDist[n - 1][m - 1]);
        scanner.close();
    }
}

/*
Кол-во строк:
3
Кол-во столбцов:
3
Цена каждой клетки(заполняется слева направо):
1 3 1 1 5 1 4 2 1
Минимальная сумма пути: 7
 */
