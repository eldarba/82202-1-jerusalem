package app.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class GUIApp {
	RestTemplate rt = new RestTemplate();

	public static void main(String[] args) {
		GUIApp ui = new GUIApp();
		ui.createGui();

	}

	private void createGui() {//
		JFrame fr = new JFrame("Employees");
		fr.setLayout(null);
		fr.setBounds(100, 100, 600, 300);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lbId = new JLabel("employee id");
		lbId.setBounds(25, 25, 150, 25);
		fr.add(lbId);

		JTextField tfId = new JTextField();
		tfId.setBounds(200, 25, 150, 25);
		fr.add(tfId);

		JButton btSend = new JButton("Send");
		btSend.setBounds(25, 90, 150, 25);
		fr.add(btSend);

		JLabel lbDisp = new JLabel();
		lbDisp.setBounds(25, 130, 300, 25);
		fr.add(lbDisp);

		btSend.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// on click
					lbDisp.setText(null);
					long id = Long.parseLong(tfId.getText());
					String url = "http://localhost:8080/api/employee/find-one?empId=" + id;
					Employee emp = rt.getForObject(new URI(url), Employee.class);
					lbDisp.setText(emp.toString());
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				} catch (RestClientException e2) {
					lbDisp.setText(e2.getMessage());
				} catch (NumberFormatException e2) {
					lbDisp.setText("Bad Input: " + e2.getMessage());
				}

			}
		});

		fr.setVisible(true);
	}

}
