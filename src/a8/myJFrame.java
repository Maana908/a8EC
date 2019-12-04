package a8;

import java.awt.*;
import javax.swing.SwingUtilities;

import javax.swing.*;


public class myJFrame{
public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		@Override
		public void run() {
			int[][] inputArr = new int[15][15];
			ConwayView view = new ConwayView(inputArr);
		}
});
		
}


}
