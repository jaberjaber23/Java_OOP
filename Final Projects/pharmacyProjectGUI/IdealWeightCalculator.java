package pharmacyProjectGUI;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IdealWeightCalculator {
	public static void GUI() {

		JFrame frame = new JFrame();
		frame.setSize(300, 400);
		frame.setLocationRelativeTo(null);
		frame.setAlwaysOnTop(true);
		frame.setLocationByPlatform(true);

		JLabel firstLebel = new JLabel();
		firstLebel.setText("Weight(Kg):");
		firstLebel.setBounds(50, 30, 150, 20);

		JTextField firstTextField = new JTextField();
		firstTextField.setBounds(50, 50, 150, 20);

		JLabel secondLebel = new JLabel();
		secondLebel.setText("Heigh(m): ");
		secondLebel.setBounds(50, 80, 150, 20);

		JTextField secondTextField = new JTextField();
		secondTextField.setBounds(50, 100, 150, 20);

		JTextField resultTextField = new JTextField("Your BMI is = ");
		resultTextField.setBounds(50, 150, 150, 20);
		resultTextField.setEditable(false);

		JButton startButton = new JButton("Show The Result");
		startButton.setBounds(50, 200, 150, 50);
		startButton.setBackground(Color.GREEN.darker());

		startButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String height = firstTextField.getText();
				String weight = secondTextField.getText();
				float heightParse = 0f;
				float weightParse = 0f;
				float result = 0f;

				if (!height.equals("") && !weight.equals("")) {
					heightParse = Float.parseFloat(height);
					weightParse = Float.parseFloat(weight);
				}
				result = weightParse / (heightParse * heightParse);
				resultTextField.setText(result + " ");
				System.out.println("your BMI is = "+ result);

			}
		});

		startButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				startButton.setBackground(Color.GREEN.darker());
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// Not working :(
				startButton.setBackground(Color.GREEN.darker());
			}

			@Override
			public void mouseExited(MouseEvent e) {
				startButton.setBackground(Color.GREEN.darker());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				startButton.setBackground(Color.GREEN.brighter());
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				startButton.setBackground(Color.GREEN.brighter());
			}
		});
		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(50, 270, 150, 50);
		exitButton.setBackground(Color.ORANGE);

		exitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		exitButton.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
				exitButton.setBackground(Color.ORANGE);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// Not working :(
				exitButton.setBackground(Color.ORANGE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				exitButton.setBackground(Color.ORANGE);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				exitButton.setBackground(Color.ORANGE.brighter());
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				exitButton.setBackground(Color.ORANGE.brighter());
			}
		});

		firstTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				System.out.println("Your Weight is = " + firstTextField.getText());
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		secondTextField.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode() == KeyEvent.VK_ENTER)
				System.out.println("Your Height is = " + secondTextField.getText());

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		frame.add(firstLebel);
		frame.add(firstTextField);
		frame.add(secondLebel);
		frame.add(secondTextField);
		frame.add(startButton);
		frame.add(exitButton);
		frame.add(resultTextField);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
