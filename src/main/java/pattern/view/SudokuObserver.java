package pattern.view;

import pattern.model.SudokuModel;

public interface SudokuObserver {


    void update(int row, int col, int value);

}
