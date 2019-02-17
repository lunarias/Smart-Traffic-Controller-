package guiproject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.JLayeredPane;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import java.awt.Image;
import javax.swing.JLabel;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		System.out.println("asdfs");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		System.out.println("2");
		initialize(); //initialize all components inside form (buttons, labels, etc,)
		System.out.println("3");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		System.out.println("4");
		frame = new JFrame();
	//	frame.setBounds(100, 100, 918, 615);
		frame.setSize(1900, 1000);		
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1557, Short.MAX_VALUE)
					.addGap(1)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 678, GroupLayout.PREFERRED_SIZE)
							.addGap(1)
							.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 947, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		
		JLabel MapImage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/map.PNG")).getImage();
		Image scaledImg = img.getScaledInstance(1554, 947, Image.SCALE_SMOOTH);
		MapImage.setIcon(new ImageIcon(scaledImg));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addComponent(MapImage)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addComponent(MapImage, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		frame.getContentPane().setLayout(groupLayout);
		System.out.println("5");
	}
}
