package pattern.controller;

import pattern.model.SudokuModel;
import pattern.view.SudokuCellView;
import pattern.view.SudokuComposite;
import pattern.view.SudokuObserver;
import pattern.view.SudokuView;

import java.util.Scanner;

public class SudokuController {

    private SudokuModel sudokuModel;
    private SudokuView sudokuView;
    public void startGame(){
        sudokuView = new SudokuView();
        sudokuView.displayWelcomeMessage();
        sudokuModel = new SudokuModel(askUserForValue());

    }

    public void handleUserInput(){

    }

    public int askUserForValue() {
        System.out.print("Enter value (1-9): ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        return value;
    }
    public int[] askUserForCoords() {
        Scanner scanner = new Scanner(System.in);
        int[] coords = new int[2];
        System.out.println("Enter row number (1-9):");
        coords[0] = scanner.nextInt() - 1; // Convert to 0-based indexing
        System.out.println("Enter column number (1-9):");
        coords[1] = scanner.nextInt() - 1; // Convert to 0-based indexing
        return coords;
    }

}
