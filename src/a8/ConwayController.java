package a8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ConwayController implements ActionListener {
 
	ConwayView view;
	ConwayModel model;
	JSpotBoard _board;
	
	public ConwayController(ConwayModel model, ConwayView view) {
		this.model = model;
		this.view = view;
		this._board = view.getBoardState();
		initView();
	}
	
	 public void initView() {
//		  view.getFirstnameTextfield().setText(model.getFirstname());
//		  view.getLastnameTextfield().setText(model.getLastname());
		 }
	 
	 public void initController() {
//		  view.getFirstnameSaveButton().addActionListener(e -> saveFirstname());
//		  view.getLastnameSaveButton().addActionListener(e -> saveLastname());
//		  view.getHello().addActionListener(e -> sayHello());
//		  view.getBye().addActionListener(e -> sayBye());
	}

	public int nextGenDeterminer(Spot s) {
		int x = s.getSpotX();
		int y = s.getSpotY();
		int numOfLiveCells = 0;
		Color alive = Color.GREEN;
		Color dead = Color.RED;
		
		
		
		//checks neighbors
		if(_board.getSpotAt(x-1, y-1) != null &&
		   _board.getSpotAt(x-1, y-1).getSpotColor().equals(alive)) {
			numOfLiveCells++;
		}
		if(_board.getSpotAt(x, y-1) != null &&
		   _board.getSpotAt(x, y-1).getSpotColor().equals(alive)) {
			numOfLiveCells++;
		}
		if(_board.getSpotAt(x+1, y-1) != null &&
		   _board.getSpotAt(x+1, y-1).getSpotColor().equals(alive)) {
			numOfLiveCells++;
		}
		if(_board.getSpotAt(x-1, y) != null &&
		   _board.getSpotAt(x-1, y).getSpotColor().equals(alive)) {
			numOfLiveCells++;
		}
		if(_board.getSpotAt(x+1, y) != null &&
		   _board.getSpotAt(x+1, y).getSpotColor().equals(alive)) {
			numOfLiveCells++;
		}
		if(_board.getSpotAt(x-1, y+1) != null &&
		   _board.getSpotAt(x-1, y+1).getSpotColor().equals(alive)) {
			numOfLiveCells++;
		}
		if(_board.getSpotAt(x, y+1) != null &&
		   _board.getSpotAt(x, y+1).getSpotColor().equals(alive)) {
			numOfLiveCells++;
		}
		if(_board.getSpotAt(x+1, y+1) != null &&
		   _board.getSpotAt(x+1, y+1).getSpotColor().equals(alive)) {
			numOfLiveCells++;
		}
		
		//check num of live neighbors
		if(_board.getSpotAt(x, y) != null 
		   && _board.getSpotAt(x, y).getSpotColor().equals(alive)) {
			if(numOfLiveCells < 2 || numOfLiveCells > 3) {
				return 0;
			} else if (numOfLiveCells == 2 || numOfLiveCells == 3) {
				return 1;
			}
		} else if(_board.getSpotAt(x, y) != null 
				  && _board.getSpotAt(x, y).getSpotColor().equals(dead)) {
			if(numOfLiveCells == 3) {
				return 1;
			}
		}
		return 0;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
