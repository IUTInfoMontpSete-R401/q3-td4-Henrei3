package pattern;

import pattern.model.SudokuModel;
import pattern.view.SudokuComposite;
import pattern.view.SudokuView;

public class SetValueCommand implements SudokuCommand {

    int[]coords;
    int previous;
    SudokuModel model;

    public SetValueCommand(SudokuModel model){
        this.model=model;
    }

    public void execute(){
        SudokuView sudokuView = new SudokuView();
        int[] coords = sudokuView.askUserForCoords();
        int val = sudokuView.askUserForValue();
        this.coords = coords;
        previous = val;
        model.setValueAt(coords[0],coords[1],val);
    }
    public void undo(){
        model.setValueAt(coords[0],coords[1],previous);
    }
}
