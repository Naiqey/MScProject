import java.util.Scanner;

public class RecursiveNestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入数字 n：");
        int n = scanner.nextInt();

        int[][] combination = new int[10000000][n]; // 修改数组大小根据需要

        generateNumbers(0, n, combination, new int[n], 0);

        // 打印生成的组合
        for (int i = 0; i < combination.length && combination[i][0] != 0; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(combination[i][j]);
            }
            System.out.println();
        }
    }

    public static void generateNumbers(int currentDigit, int n, int[][] combination, int[] currentNumber, int currentIndex) {
        if (currentDigit == n) {
            System.arraycopy(currentNumber, 0, combination[currentIndex], 0, n);
            combination[currentIndex][0] = currentNumber[0]; // 标记数组结束
        } else {
            for (int i = 0; i <= 9; i++) {
                currentNumber[currentDigit] = i;
                generateNumbers(currentDigit + 1, n, combination, currentNumber, currentIndex);
            }
        }
    }
}
