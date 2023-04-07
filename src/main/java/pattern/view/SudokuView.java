package pattern.view;

import pattern.model.SudokuModel;

import java.util.ArrayList;
import java.util.List;

public class SudokuView implements SudokuComposite,SudokuObserver {
        private final List<SudokuComposite> cellsView= new ArrayList<>();

        public SudokuView(){}
        public SudokuView(SudokuModel sudokuModel){
            addModel(sudokuModel);
        }
        public void addModel(SudokuModel sudokuModel){
            for(int row = 0; row < sudokuModel.getBoardSize(); row++){
                if(row % sudokuModel.getBlockSize() == 0){
                    SudokuComposite leaf = new SudokuCellView(sudokuModel, this,row, row + sudokuModel.getBlockSize() -1 );
                    this.addSudokuComposite(leaf);
                    sudokuModel.registerObserver((SudokuObserver) leaf);
                }
            }
        }

        @Override
        public void display (){
            System.out.println(" -----------------------");
            for (SudokuComposite s : cellsView) {
                s.display();
                System.out.println(" -----------------------");
            }
        }
        public void addSudokuComposite(SudokuComposite sudokuComposite){
            cellsView.add(sudokuComposite);
        }
        public void removeSudokuComposite(SudokuComposite sudokuComposite){
            cellsView.remove(sudokuComposite);
        }

        @Override
        public void update ( int row, int col, int value){
        System.out.println("Cell at row " + row + ", column " + col + " updated to " + value);
        display();
        }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to Sudoku game!");
        System.out.println("Please enter the board size:");
    }
    public void displayVictoryMessage() {
        System.out.println("Congratulations, you won the game!");
    }

}
