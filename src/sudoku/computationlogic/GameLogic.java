package sudoku.computationlogic;

import sudoku.constants.GameState;
import sudoku.problemdoimain.SudokuGame;

public class GameLogic {

  public static SudokuGame getNewGame() {
    return new SudokuGame(
        GameState.NEW,
        GameGenerator.getNewGameGrid());
  }

  public static GameState checkForCompletion(int[][] grid) {
    if (sudokuIsInvalid(grid))
      return GameState.Active;
    if (tilesAreNotFilled(grid))
      return GameState.Active;
    return GameState.COMPLETE;
  }

}
