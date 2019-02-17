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
import java.awt.Label;
import java.awt.Canvas;
import java.awt.Panel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import java.awt.List;

public class GUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
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
		initialize(); //initialize all components inside form (buttons, labels, etc,)		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
	//	frame.setBounds(100, 100, 918, 615);
		frame.setSize(1900, 1000);		
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(1544, Short.MAX_VALUE)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 338, GroupLayout.PREFERRED_SIZE))
						.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1533, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 857, GroupLayout.PREFERRED_SIZE)
					.addGap(85)
					.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
					.addContainerGap())
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
		);
		
		JLabel RoadButton1 = new JLabel("");
		Image red = new ImageIcon(this.getClass().getResource("/dot.PNG")).getImage();
		Image scaledred = red.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		RoadButton1.setIcon(new ImageIcon(scaledred));		
		
		
		
		
		Image img = new ImageIcon(this.getClass().getResource("/map.PNG")).getImage();
		Image scaledImg = img.getScaledInstance(1554, 947, Image.SCALE_SMOOTH);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel RoadButton2 = new JLabel("");		
		RoadButton2.setIcon(new ImageIcon(scaledred));	
		
		RoadButton2.setBounds(66, 626, 52, 56);
		layeredPane.add(RoadButton2);
		RoadButton1.setBounds(66, 360, 38, 56);
		layeredPane.add(RoadButton1);
		
		JLabel label = new JLabel("");
		label.setBounds(852, 455, 38, 56);
		layeredPane.add(label);
		
		JLabel RoadButton3 = new JLabel("");
		RoadButton3.setIcon(new ImageIcon(scaledred));			
		RoadButton3.setBounds(1416, 424, 72, 63);
		layeredPane.add(RoadButton3);
		
		JLabel RoadButton4 = new JLabel("");
		RoadButton4.setIcon(new ImageIcon(scaledred));			
		RoadButton4.setBounds(266, 634, 72, 63);
		layeredPane.add(RoadButton4);
		
		JLabel RoadButton5 = new JLabel("");
		RoadButton5.setIcon(new ImageIcon(scaledred));	
		RoadButton5.setBounds(645, 643, 100, 86);
		layeredPane.add(RoadButton5);
		
		JLabel RoadButton6 = new JLabel("");
		RoadButton6.setIcon(new ImageIcon(scaledred));	
		RoadButton6.setBounds(280, 360, 72, 63);
		layeredPane.add(RoadButton6);
		
		JLabel RoadButton7 = new JLabel("");
		RoadButton7.setIcon(new ImageIcon(scaledred));	
		RoadButton7.setBounds(53, 80, 90, 56);
		layeredPane.add(RoadButton7);
		
		JLabel RoadButton8 = new JLabel("");
		RoadButton8.setIcon(new ImageIcon(scaledred));	
		RoadButton8.setBounds(280, 102, 74, 56);
		layeredPane.add(RoadButton8);
		
		JLabel RoadButton9 = new JLabel("");
		RoadButton9.setIcon(new ImageIcon(scaledred));	
		RoadButton9.setBounds(653, 120, 64, 56);
		layeredPane.add(RoadButton9);
		
		JLabel RoadButton10 = new JLabel("");
		RoadButton10.setIcon(new ImageIcon(scaledred));	
		RoadButton10.setBounds(1051, 135, 84, 56);
		layeredPane.add(RoadButton10);
		
		JLabel RoadButton12 = new JLabel("");
		RoadButton12.setIcon(new ImageIcon(scaledred));	
		RoadButton12.setBounds(1041, 408, 72, 56);
		layeredPane.add(RoadButton12);
		
		JLabel RoadButton13 = new JLabel("");
		RoadButton13.setIcon(new ImageIcon(scaledred));	
		RoadButton13.setBounds(645, 381, 72, 56);
		layeredPane.add(RoadButton13);
		
		JLabel RoadButton14 = new JLabel("");
		RoadButton14.setIcon(new ImageIcon(scaledred));	
		RoadButton14.setBounds(1028, 673, 64, 56);
		layeredPane.add(RoadButton14);
		
		JLabel RoadButton15 = new JLabel("");
		RoadButton15.setIcon(new ImageIcon(scaledred));	
		RoadButton15.setBounds(1416, 706, 64, 48);
		layeredPane.add(RoadButton15);
		
		JLabel RoadButton16 = new JLabel("");
		RoadButton16.setIcon(new ImageIcon(scaledred));	
		RoadButton16.setBounds(1429, 165, 72, 48);
		layeredPane.add(RoadButton16);
		
		JLabel MapImage = new JLabel("");
		MapImage.setBounds(0, 0, 1533, 965);
		layeredPane.add(MapImage);
		MapImage.setVerticalAlignment(SwingConstants.BOTTOM);
		MapImage.setIcon(new ImageIcon(scaledImg));

	

		
		JLabel lblNewLabel = new JLabel("Time & Date:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblWeather = new JLabel("Weather:");
		lblWeather.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		JLabel lblNewLabel_2 = new JLabel("Location:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblDensity = new JLabel("Density:");
		lblDensity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(48)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblWeather)
								.addComponent(lblNewLabel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDensity)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblWeather)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(45)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(64)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblDensity)
					.addContainerGap(587, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
