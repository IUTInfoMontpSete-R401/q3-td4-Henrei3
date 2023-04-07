package pattern.view;

import pattern.model.SudokuModel;

import java.util.ArrayList;
import java.util.List;

public class SudokuView implements SudokuComposite {
        private SudokuModel model = null;
        private final List<SudokuComposite> cellsView= new ArrayList<>();
        public SudokuView(){}
        public SudokuView(SudokuModel cell){
            model = cell;
        }

        public void addModel(SudokuModel cell){model = cell;}

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


    public void displayWelcomeMessage() {
        System.out.println("Welcome to Sudoku game!");
        System.out.println("Please enter the board size:");
    }
    public void displayVictoryMessage() {
        System.out.println("Congratulations, you won the game!");
    }

}
