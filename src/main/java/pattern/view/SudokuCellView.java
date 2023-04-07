package pattern.view;

import pattern.model.SudokuModel;

public class SudokuCellView implements SudokuComposite, SudokuObserver {

    private SudokuModel model = null;

    private final int rowDebut;
    private final int rowFin;

    public SudokuCellView(SudokuModel cell, int rowDebut,int rowFin){
        model = cell;
        this.rowDebut = rowDebut;
        this.rowFin = rowFin;
    }
    int [][] cell;
    @Override
    public void display() {
    for(int row = rowDebut; row < rowFin; row++){
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
    public void update ( int row, int col, int value){
        System.out.println("Cell at row " + row + ", column " + col + " updated to " + value);
        display();
    }
}
