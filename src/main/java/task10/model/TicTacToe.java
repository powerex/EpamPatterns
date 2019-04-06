package task10.model;

import task10.tool.RecoveryTool;

public class TicTacToe {

    private static final char[] playerMarkers = {'X', 'O', ' '};
    private int[][] field;
    private int currentPlayer = 0;

    public TicTacToe() {
        field = new int[][]{{2, 2, 2}, {2, 2, 2}, {2, 2, 2}};
        // 2 - is marker for empty cell
    }

    public void render() {
        System.out.println("\n" + playerMarkers[field[0][0]] + '|' +
                                playerMarkers[field[0][1]] + '|' +
                                playerMarkers[field[0][2]]);
        System.out.println("-----");
        System.out.println("" + playerMarkers[field[1][0]] + '|' +
                                playerMarkers[field[1][1]] + '|' +
                                playerMarkers[field[1][2]]);
        System.out.println("-----");
        System.out.println("" + playerMarkers[field[2][0]] + '|' +
                                playerMarkers[field[2][1]] + '|' +
                                playerMarkers[field[2][2]]);
    }

    public void nextMove(int row, int col) {
        if (row < 1 || row > 3 || col < 1 || col > 3 || field[row-1][col-1] != 2)
            System.out.println("Illegal move");
        else {
            field[row-1][col-1] = currentPlayer++;
            currentPlayer %= 2;
        }
    }

    public int[][] getField() {
        return field;
    }

    public void setField(int[][] field) {
        this.field = field;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(int currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
}
