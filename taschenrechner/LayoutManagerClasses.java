package taschenrechner;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LayoutManagerClasses {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		jFrame.setSize(400, 450);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container mainContainer = jFrame.getContentPane();
		mainContainer.setLayout(new FlowLayout(FlowLayout.CENTER));

		/** Btn-Erzeugung */

		JPanel jPanel1 = new JPanel();
		jPanel1.setBackground(Color.blue);
		jPanel1.setLayout(new FlowLayout());

		for (int i = 1; i < 5; i++) {
			jPanel1.add(new JButton("Button" + i));
		}

		/** Label erzeugen **/

		JPanel jPanel2 = new JPanel();
		jPanel2.setBackground(Color.cyan);
		jPanel2.setLayout(new FlowLayout());

		for (int i = 1; i < 5; i++) {
			jPanel2.add(new JLabel("Label" + i));
		}

		JTextField jTextField = new JTextField();
		jTextField.setPreferredSize(new Dimension(400, 100));

		JSpinner jSpinner = new JSpinner();
		JTextArea jTextArea = new JTextArea("Bitte den ein Kommentar hinzufügen.");

		// mainContainer.add(jTextArea);// BorderLayout.LINE_END
		// mainContainer.add(jSpinner);//BorderLayout.PAGE_END
		// mainContainer.add(jTextField);// BorderLayout.PAGE_START
		// mainContainer.add(jPanel1); // BorderLayout.CENTER
		// mainContainer.add(jPanel2);// BorderLayout.LINE_START

		String[] button = { "AC", "+/-", "%", "÷", "7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".",
				"=", "+" };

		JPanel jPanel3 = new JPanel(new GridLayout(5, 4, 5, 5));
		jPanel3.setBackground(Color.darkGray);
		jPanel3.setPreferredSize(new Dimension(400, 300));

		for (int i = 0; i < button.length; i++) {
			jPanel3.add(new JButton(button[i]));
		}

		mainContainer.add(jTextField);
		mainContainer.add(jPanel3);

		jFrame.setResizable(false);
		jFrame.setVisible(true);
	}

}