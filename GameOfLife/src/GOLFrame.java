import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class GOLFrame extends JFrame {

	private JPanel contentPane;
	
	
	//main method
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GOLFrame frame = new GOLFrame(6,8);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
	
	
	
	//constructor creates frame with all panels and buttons on it
	public GOLFrame(int width, int height) {
		// set bounds of window and overall Panel
		setBounds(0,0,800,300);
		contentPane = new JPanel();
		setContentPane(contentPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JPanel for the initial state grid
		JPanel initial = new JPanel();
        GridLayout gl =new GridLayout(6,8);
        initial.setLayout(gl);
        JLabel initialTitle = new JLabel ("Initial State");
        add(initialTitle);
		Cell[][] GOL = new Cell[width][height];
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				GOL[i][j] = new Cell(i, j);
			}
		}
		
		JButton[][] board = new JButton[6][8]; 
        for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				JButton button = new JButton("");
				int x = i;
				int y = j;
				button.setPreferredSize(new Dimension(35,35));
				button.setBackground(Color.white);
				button.setOpaque(true);
				button.setBorderPainted(false);
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) { 
						GOL[x][y].setAlive();
						button.setBackground(GOL[x][y].color);
					  }
				});
				board[i][j] = button;
				initial.add(button);
			}
        }
        
		add(initial);
		
		JPanel after = new JPanel();
        after.setLayout(gl);
        JLabel afterTitle = new JLabel ("New State");
        add(afterTitle);
		Cell[][] GOLafter = new Cell[width][height];
		for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				GOLafter[i][j] = new Cell(i, j);
			}
		}
		
		JButton[][] boardAfter = new JButton[6][8]; 
        for (int i=0; i<width; i++) {
			for (int j=0; j<height; j++) {
				JButton button = new JButton("");
				button.setPreferredSize(new Dimension(35,35));
				button.setBackground(Color.white);
				button.setOpaque(true);
				button.setBorderPainted(false);
				boardAfter[i][j] = button;
				after.add(button);
			}
        }
        
		add(after);
		
		
		JButton reset = new JButton("Reset");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				reset();
			}

			private void reset() {
				for (int i=0; i<width; i++) {
					for (int j=0; j<height; j++) {
						GOL[i][j].alive = false;
						GOLafter[i][j].alive = false;
						board[i][j].setBackground(Color.white);
						boardAfter[i][j].setBackground(Color.white);
					}
				}
				
			}
		});
		
		add(reset);
		
	}
	

}
