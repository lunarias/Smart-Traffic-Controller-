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
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI {

	private JFrame frame;
	private JTextField Date;
	private JTextField Weather;
	private JTextField Location;
	private JTextField Density;
	private JTextField textField_4;
	private JTextField North;
	private JTextField South;
	private JTextField East;
	private JTextField West;
	private JTextField Time;

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
	
	public void intersectionInfo(String str) {
		Location.setText(str);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
			
		frame = new JFrame();
		frame.setTitle("Smart Traffic Simulator");
	//	frame.setBounds(100, 100, 918, 615);
		frame.setSize(1900, 1000);		
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		
		JLayeredPane layeredPane = new JLayeredPane();
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBackground(new Color(255, 228, 181));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(layeredPane, GroupLayout.PREFERRED_SIZE, 1533, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 348, Short.MAX_VALUE))
					.addGap(12))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(layeredPane_1, GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
				.addComponent(layeredPane, GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE)
		);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 228, 196));
		panel_1.setBounds(0, 0, 348, 598);
		layeredPane_1.add(panel_1);
		
		JLabel lblNewLabel_3 = new JLabel("Traffic Lights:");
		lblNewLabel_3.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JLabel lblNorth = new JLabel("North");
		lblNorth.setFont(new Font("Calibri", Font.PLAIN, 22));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 228, 196));
		
		JLabel lblTrafficLights = new JLabel("Traffic Lights");
		lblTrafficLights.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		JLabel NorthLabel = new JLabel("North:");
		NorthLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
		
		JLabel SouthLabel = new JLabel("South:");
		SouthLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
		
		JLabel EastLabel = new JLabel("East:");
		EastLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
		
		JLabel WestLabel = new JLabel("West:");
		WestLabel.setFont(new Font("Calibri", Font.PLAIN, 22));
		
		North = new JTextField();
		North.setFont(new Font("Tahoma", Font.PLAIN, 22));
		North.setColumns(10);
		
		South = new JTextField();
		South.setFont(new Font("Tahoma", Font.PLAIN, 22));
		South.setColumns(10);
		
		East = new JTextField();
		East.setFont(new Font("Tahoma", Font.PLAIN, 22));
		East.setColumns(10);
		
		West = new JTextField();
		West.setFont(new Font("Tahoma", Font.PLAIN, 22));
		West.setColumns(10);
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(25)
							.addComponent(lblTrafficLights))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(54)
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(WestLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
									.addComponent(West, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
									.addComponent(EastLabel, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
									.addComponent(East, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
									.addComponent(SouthLabel, GroupLayout.PREFERRED_SIZE, 76, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(South, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE))
								.addGroup(Alignment.TRAILING, gl_panel_3.createSequentialGroup()
									.addComponent(NorthLabel)
									.addPreferredGap(ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
									.addComponent(North, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)))
							.addGap(45)))
					.addContainerGap(27, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(54)
					.addComponent(lblTrafficLights, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(NorthLabel)
						.addComponent(North, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(SouthLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(South, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(EastLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(East, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(WestLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(West, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(320, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(25)
							.addComponent(lblNewLabel_3)
							.addGap(18)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(54)
							.addComponent(lblNorth)))
					.addContainerGap(22, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(54)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNorth))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 598, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(137, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(116, 143, 10, 10);
		layeredPane_1.add(panel_2);
		panel_2.setBackground(Color.BLUE);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel RoadButton1 = new JLabel("");
		Image red = new ImageIcon(this.getClass().getResource("/dot.PNG")).getImage();
		Image scaledred = red.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		RoadButton1.setIcon(new ImageIcon(scaledred));		
		
		
		
		
		Image img = new ImageIcon(this.getClass().getResource("/map.PNG")).getImage();
		Image scaledImg = img.getScaledInstance(1554, 947, Image.SCALE_SMOOTH);
		
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
		RoadButton15.setBounds(1402, 705, 64, 48);
		layeredPane.add(RoadButton15);
		
		JLabel RoadButton16 = new JLabel("");
		RoadButton16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				intersectionInfo("RoadButton16");
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Location.setText("");
			}
		});
		RoadButton16.setIcon(new ImageIcon(scaledred));	
		RoadButton16.setBounds(1429, 165, 37, 48);
		layeredPane.add(RoadButton16);
		
		JLabel MapImage = new JLabel("");
		MapImage.setBounds(0, 0, 1533, 965);
		layeredPane.add(MapImage);
		MapImage.setVerticalAlignment(SwingConstants.BOTTOM);
		MapImage.setIcon(new ImageIcon(scaledImg));

	

		
		JLabel lblNewLabel = new JLabel("Time:");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		JLabel lblWeather = new JLabel("Weather:");
		lblWeather.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		JLabel lblNewLabel_2 = new JLabel("Location:");
		lblNewLabel_2.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		JLabel lblDensity = new JLabel("Density:");
		lblDensity.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		Date = new JTextField();
		Date.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Date.setColumns(10);
		
		Weather = new JTextField();
		Weather.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Weather.setColumns(10);
		
		Location = new JTextField();
		Location.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Location.setColumns(10);
		
		Density = new JTextField();
		Density.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Density.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Date:");
		lblNewLabel_4.setFont(new Font("Calibri", Font.PLAIN, 24));
		
		Time = new JTextField();
		Time.setFont(new Font("Tahoma", Font.PLAIN, 22));
		Time.setColumns(10);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(11)
											.addComponent(lblDensity))
										.addComponent(lblNewLabel_4))
									.addGap(11))
								.addComponent(lblNewLabel_2))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(4)
									.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(Time, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
										.addComponent(Date, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(Density, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
										.addComponent(Location, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
									.addGap(387)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))))
						.addComponent(lblNewLabel)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblWeather)
							.addGap(18)
							.addComponent(Weather, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(40)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(Date, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(Time, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblWeather)
						.addComponent(Weather, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(4)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
								.addComponent(Location, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblDensity)
								.addComponent(Density, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(96, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		
	}
}
