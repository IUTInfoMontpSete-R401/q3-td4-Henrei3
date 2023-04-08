package tests;

import org.junit.Test;
import pattern.model.SudokuModel;
import pattern.view.SudokuView;

public class CompositeTest {
    @Test
    public void composite_Test(){
        SudokuModel s = new SudokuModel(9);
        SudokuView v = new SudokuView(s);
        s.setValueAt(1,1,5);
    }
}
