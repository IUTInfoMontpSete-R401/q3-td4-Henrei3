package antipattern;


//import pattern.*;

public class SudokuApp {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku(3);
        SudokuSolver solver = new SudokuSolver();
        solver.solve(sudoku);
    }
}
