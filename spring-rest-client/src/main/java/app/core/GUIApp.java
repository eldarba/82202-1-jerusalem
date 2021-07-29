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
		lbId.setBounds(25, 20, 150, 25);
		fr.add(lbId);

		JTextField tfId = new JTextField();
		tfId.setBounds(200, 20, 150, 25);
		fr.add(tfId);

		JLabel lbName = new JLabel("employee name");
		lbName.setBounds(25, 50, 150, 25);
		fr.add(lbName);

		JTextField tfName = new JTextField();
		tfName.setBounds(200, 50, 150, 25);
		fr.add(tfName);

		JLabel lbRole = new JLabel("employee role");
		lbRole.setBounds(25, 80, 150, 25);
		fr.add(lbRole);

		JTextField tfRole = new JTextField();
		tfRole.setBounds(200, 80, 150, 25);
		fr.add(tfRole);

		JButton btRead = new JButton("Read");
		btRead.setBounds(25, 110, 70, 25);
		fr.add(btRead);

		JButton btAdd = new JButton("Add");
		btAdd.setBounds(125, 110, 70, 25);
		fr.add(btAdd);

		JLabel lbDisp = new JLabel();
		lbDisp.setBounds(25, 140, 300, 25);
		fr.add(lbDisp);

		btRead.addActionListener(new ActionListener() {

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

		btAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					// on click
					tfName.setText(null);
					tfRole.setText(null);
					String name = tfId.getText();
					String role = tfRole.getText();
					String url = "http://localhost:8080/api/employee/add";
					Employee emp = new Employee(name, role);
					long id = rt.postForObject(new URI(url), emp, Long.class);
					lbDisp.setText("id: " + id);
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
