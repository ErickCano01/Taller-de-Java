package Pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class BorderLayout extends JFrame {

	private JPanel contentPane;
	private JTextField txtText;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayout frame = new BorderLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public BorderLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new java.awt.BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("LABEL");
		contentPane.add(lblNewLabel, java.awt.BorderLayout.WEST);
		
		JButton btnNewButton = new JButton("button");
		contentPane.add(btnNewButton, java.awt.BorderLayout.CENTER);
		
		txtText = new JTextField();
		txtText.setText("TEXT");
		contentPane.add(txtText, java.awt.BorderLayout.EAST);
		txtText.setColumns(10);
		
		JTextArea txtrTextArea = new JTextArea();
		txtrTextArea.setText("TEXT AREA");
		contentPane.add(txtrTextArea, java.awt.BorderLayout.SOUTH);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CHECK BOX");
		contentPane.add(chckbxNewCheckBox, java.awt.BorderLayout.NORTH);
	}

}
