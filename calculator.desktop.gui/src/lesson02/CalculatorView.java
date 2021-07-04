package lesson02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CalculatorView {

	private CalculatorModel calculatorModel = new CalculatorModel();
	private JFrame fr = new JFrame("calculator");
	private JTextField tfFirstNum = new JTextField();
	private JTextField tfSecondNum = new JTextField();
	private JLabel lbResVal = new JLabel("0");

	public static void main(String[] args) {
		CalculatorView view = new CalculatorView();
		view.createAndShowView();
	}

	private void createAndShowView() {
		// create the main window
		fr.setLayout(null);
		fr.setBounds(100, 100, 500, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbFirstNum = new JLabel("enter first number");
		lbFirstNum.setBounds(10, 30, 150, 25);
		fr.add(lbFirstNum);

		tfFirstNum.setBounds(150, 30, 150, 25);
		fr.add(tfFirstNum);

		JLabel lbsecondNum = new JLabel("enter second number");
		lbsecondNum.setBounds(10, 60, 150, 25);
		fr.add(lbsecondNum);

		tfSecondNum.setBounds(150, 60, 150, 25);
		fr.add(tfSecondNum);

		JButton btAdd = new JButton("+");
		btAdd.setBounds(10, 90, 45, 25);
		// controller code - connect view and model
		MyListener listener = new MyListener();
		btAdd.addActionListener(listener);

		JButton btSub = new JButton("-");
		btSub.setBounds(60, 90, 45, 25);
		JButton btMul = new JButton("x");
		btMul.setBounds(110, 90, 45, 25);
		JButton btDiv = new JButton(":");
		btDiv.setBounds(160, 90, 45, 25);

		fr.add(btAdd);
		fr.add(btSub);
		fr.add(btMul);
		fr.add(btDiv);

		JLabel lbRes = new JLabel("result");
		lbRes.setBounds(10, 120, 150, 25);
		fr.add(lbRes);

		lbResVal.setBounds(100, 120, 150, 25);
		fr.add(lbResVal);

		fr.setVisible(true);
	}

	public class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int a = Integer.parseInt(tfFirstNum.getText());
				int b = Integer.parseInt(tfSecondNum.getText());
				// use the model for business logic
				int sum = calculatorModel.add(a, b);
				// send result from model to view
				lbResVal.setText(String.valueOf(sum));

			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(fr, "error: " + ex.getMessage());
			}
		}

	}

}
