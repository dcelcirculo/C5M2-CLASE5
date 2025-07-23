import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        if (true) {
            testArray();
        }
    }

    private static void testArray() {
        var scanner = new Scanner(System.in);

        System.out.println("Ingresa el número de filas: ");
        var valor = scanner.nextInt();
        int[][] board = new int[3][];

        for (int row = 0; row < board.length; row++) {
            System.out.printf("Ingrese el numero de columnas de la fila %d: ", (row + 1));
            valor = scanner.nextInt();
            board[row] = new int[valor];
            for (int column = 0; column < board[row].length; column++) {
                System.out.printf("Ingrese el valor para la fila %d, columna %d: ", (row + 1), (column + 1));
                board[row][column] = scanner.nextInt();
            }
        }

        // board[0] = new int[3];
        // board[0][0] = 1;
        // board[0][1] = 2;
        // board[0][2] = 3;

        // board[1] = new int[6];
        // board[1][0] = 4;
        // board[1][1] = 5;
        // board[1][2] = 6;
        // board[1][3] = 7;
        // board[1][4] = 8;
        // board[1][5] = 9;

        // board[2] = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        scanner.close();

        System.out.println(board[0][1]);
        System.out.println(board.length);

        System.out.println("=== Contenido del tablero ===");
        for (int row = 0; row < board.length; row++) {
            // System.out.println(board[row].length);
            for (int column = 0; column < board[row].length; column++) {
                System.out.println(board[row][column] + " ");
            }
            System.out.println();
        }
    }
}
