import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GOLFrame extends JFrame {

	private JPanel contentPane;

	public GOLFrame(int width, int height) {
		//Sets up the new frame with a center image and buttons on each side
		super("BorderLayout");
		setBounds(0,0,300,300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		add(new JButton("North"), BorderLayout.CENTER);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("West"), BorderLayout.WEST);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Cell[][] GOL = new Cell[width][height];
		
	}
	
	/**
	 * Launch the application.
	 */
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

}
