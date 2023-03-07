package Pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;

public class BoxLayout extends JFrame {

	private JPanel contentPane;
	private JTextField txtText;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoxLayout frame = new BoxLayout();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BoxLayout() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new javax.swing.BoxLayout(contentPane, javax.swing.BoxLayout.X_AXIS));
		
		JButton btnNewButton = new JButton("BUTTON");
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("LABEL");
		contentPane.add(lblNewLabel);
		
		txtText = new JTextField();
		txtText.setText("TEXT");
		contentPane.add(txtText);
		txtText.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("CHECKBOX");
		contentPane.add(chckbxNewCheckBox);
		
		JTextArea txtrTextArea = new JTextArea();
		txtrTextArea.setText("TEXT AREA");
		contentPane.add(txtrTextArea);
	}

}
