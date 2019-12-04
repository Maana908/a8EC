package a8;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;


public class ConwayView extends JFrame{
	private enum Cell {GREEN, RED};
	//if alive Green
	//if dead Red
	
	private int[][] _inputCells;
	JSpotBoard _board;
	
	public ConwayView(int[][] inputCells) {
		
		_inputCells = new int[inputCells.length][inputCells[0].length];
		_board = new JSpotBoard(inputCells.length, inputCells[0].length);
		
		for(int i = 0; i < _inputCells.length; i++) {
			for(int j = 0; j < _inputCells[0].length; j++) {
				_inputCells[i][j] = inputCells[i][j];
			}
		}
		
		setTitle("Conway's Game of Life");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		_board = new JSpotBoard(inputCells.length,inputCells[0].length);
		
	}
	
	public JSpotBoard getBoardState() {
		return _board;
	}
	
	public int getBoardWidth() {
		return _board.getWidth();
	}
	
	public int getBoardHeight() {
		return _board.getHeight();
	}
	
	public void populate() {
		//if 1, alive: Green
		//if 0, dead: Red
		
		for(int i = 0; i < _inputCells.length; i++) {
			for(int j = 0; j < _inputCells[0].length; j++) {
				if (_inputCells[i][j] == 1) {
					_board.getSpotAt(i, j).setSpotColor(Color.GREEN);
				} else{
					_board.getSpotAt(i, j).setSpotColor(Color.RED);
				}
			}
		}
		
	}
	
	
	
}
