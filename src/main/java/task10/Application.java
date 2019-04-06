package task10;

import task10.model.TicTacToe;
import task10.tool.RecoveryTool;

public class Application {

    public static void main(String[] args) {
        RecoveryTool recoveryTool = new RecoveryTool();

        TicTacToe game = new TicTacToe();
        game.render();


        recoveryTool.undo(game);
        recoveryTool.saveState(game);
        game.nextMove(3, 3);
        game.render();

        recoveryTool.saveState(game);
        game.nextMove(1, 2);
        game.render();

        recoveryTool.saveState(game);
        game.nextMove(3, 1);
        game.render();

        recoveryTool.saveState(game);
        game.nextMove(3, 2);
        game.render();

        recoveryTool.saveState(game);
        game.nextMove(2, 2);
        game.render();

        recoveryTool.undo(game);
        game.render();

        recoveryTool.saveState(game);
        game.nextMove(2, 2);
        game.render();
    }

}
