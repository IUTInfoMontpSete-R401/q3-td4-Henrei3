package pattern.controller;

import pattern.SetValueCommand;
import pattern.SudokuCommand;
import pattern.model.SudokuModel;
import pattern.view.SudokuCellView;
import pattern.view.SudokuComposite;
import pattern.view.SudokuObserver;
import pattern.view.SudokuView;

import java.util.Scanner;

public class SudokuController {
    private SudokuCommand previousCommand;
    private SudokuModel sudokuModel;
    private SudokuView sudokuView;
    public void startGame(){
        sudokuView = new SudokuView();
        sudokuView.displayWelcomeMessage();
        sudokuModel = new SudokuModel(sudokuView.askUserForValue());
        sudokuView.addModel(sudokuModel);
        handleUserInput();
    }

    public void handleUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez vous faire ? ");
        System.out.println("Ajouter une Valeur (V)");
        System.out.println("Undo (U)");
        System.out.println("Resoudre (R)");
        while (true){
            SudokuCommand command = parse(sc.next());
            previousCommand = command;
            command.execute();
        }
    }
    public SudokuCommand parse(String command){
        switch (command){
            case "V" -> {
                return new SetValueCommand(sudokuModel);
            }
            case "U" -> previousCommand.undo();

            case "R" -> System.out.println("Not Yet Implemented");
        }
        return null;
    }



}
