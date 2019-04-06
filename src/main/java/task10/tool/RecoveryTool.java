package task10.tool;

import task10.model.TicTacToe;

import java.util.ArrayList;

public class RecoveryTool {

    private ArrayList<SavedState> mementos = new ArrayList<>();

    public void saveState(TicTacToe game) {
        int[][] f = game.getField();
        long result = 0;
        for (int i=0; i<f.length; i++)
            for (int j=0; j<f[i].length; j++) {
                result = result*10 + f[i][j];
            }
        result = result*10 + game.getCurrentPlayer();
        mementos.add(new SavedState(result));
    }

    public void undo(TicTacToe game) {
        if (mementos != null && mementos.size() > 0) {
            long state = mementos.get(mementos.size() - 1).getState();
            game.setCurrentPlayer((int) (state % 10));
            state /= 10;
            int[][] f = new int[3][3];
            for (int i=f.length-1; i>=0; i--)
                for (int j=f[i].length-1; j>=0; j--) {
                    f[i][j] = (int) (state % 10);
                    state /= 10;
                }
            game.setField(f);
            mementos.remove(mementos.size()-1);
        }
        else {
            System.out.println("Nothing to undo");
        }
    }
}
