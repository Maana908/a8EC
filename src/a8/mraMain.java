package a8;

import javax.swing.SwingUtilities;

public class mraMain {
	
	public static void main(String[] args) {
		ConwayModel m = new ConwayModel();
		ConwayView v = new ConwayView(new int[10][10]);
		ConwayController c = new ConwayController(m, v);
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				mraMainFrame mainFrame = new mraMainFrame();
			}
	});
	
	}
}
