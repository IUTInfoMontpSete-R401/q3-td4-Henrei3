package pattern.model;

import pattern.view.SudokuObserver;

import java.util.ArrayList;
import java.util.List;

public class SudokuModel {
    private int[][] board;

    private List<SudokuObserver> observers;

    public SudokuModel(int boardSize) {

        board = new int[boardSize][boardSize];
        observers = new ArrayList<>();
    }

    public int getValueAt(int row, int col) {
        return board[row][col];
    }

    public boolean isValueValid(int row, int col, int value) {
        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == value) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == value) {
                return false;
            }
        }

        // Check region
        int regionSize = (int) Math.sqrt(board.length);
        int rowRegionStart = (row / regionSize) * regionSize;
        int colRegionStart = (col / regionSize) * regionSize;
        for (int i = rowRegionStart; i < rowRegionStart + regionSize; i++) {
            for (int j = colRegionStart; j < colRegionStart + regionSize; j++) {
                if (board[i][j] == value) {
                    return false;
                }
            }
        }

        return true;
    }

    public void setValueAt(int row, int col, int value) {
        board[row][col] = value;
        notifyObservers(row,col,value);
    }

    public int getBoardSize() {
        return board.length;
    }


    public int getBlockSize() {

        return (int) Math.sqrt(board[0].length);
    }
    public boolean isGameFinished() {
        for (int i = 0; i < this.getBoardSize(); i++) {
            for (int j = 0; j < this.getBoardSize(); j++) {
                if (getValueAt(i, j) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public void registerObserver(SudokuObserver sudokuView){
        observers.add(sudokuView);
    }
    public void notifyObservers(int row, int col,int value ){
        for(SudokuObserver observer : observers){
            observer.update(row, col, value);
        }
    }
}
