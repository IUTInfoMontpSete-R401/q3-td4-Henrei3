package pattern.view;

import pattern.model.SudokuModel;

public class SudokuCellView implements SudokuComposite, SudokuObserver {
    private SudokuComposite sudokuParent;
    private SudokuModel model;
    private final int rowDebut;
    private final int rowFin;
    public SudokuCellView(SudokuModel cell,SudokuComposite parent, int rowDebut,int rowFin){
        model = cell;
        sudokuParent = parent;
        this.rowDebut = rowDebut;
        this.rowFin = rowFin;
    }
    @Override
    public void display() {
    for(int row = rowDebut; row <= rowFin; row++){
        for (int col = 0; col < model.getBoardSize(); col++) {
            if (col % model.getBlockSize() == 0) {
                System.out.print("| ");
            }
            int value = model.getValueAt(row, col);
            if (value == 0) {
                System.out.print("  ");
            } else {
                System.out.print(value + " ");
            }
        }
        System.out.println("|");
        }
    }

    @Override
    public void update (int row, int col, int value){
        if(rowDebut<=row && row<=rowFin){
            ((SudokuView)sudokuParent).update(row,col,value);
        }
    }
}
