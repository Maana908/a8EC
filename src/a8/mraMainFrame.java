package a8;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

public class mraMainFrame extends JFrame{
	private JButton button;
	
	
	public mraMainFrame() {
		super("Conway Game");
		
		setLayout(new BorderLayout());
		//button = new JButton("Maanasa Action");
		add(button, BorderLayout.SOUTH);
		add(getConwayGrid(), BorderLayout.CENTER);
		
		setSize(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	protected JComponent getConwayGrid() {
		JPanel gPanel = new JPanel();
		gPanel.setLayout(new GridLayout(10,10));
		JLabel[][] mraLabel = new JLabel[10][10];
		for(int r = 0; r < 10; r++) {
			for(int c =0; c<10; c++) {
				mraLabel[r][c] = new JLabel(r + ", " + c);
				gPanel.add(mraLabel[r][c]);
			}
		}
		mraLabel[6][7].setOpaque(true);
		mraLabel[6][7].setBackground(Color.BLACK);
		return gPanel;
	}
}
