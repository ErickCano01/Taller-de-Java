package Pack;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.ComponentOrientation;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.Action;
import java.awt.Toolkit;

public class VentanaPrincipal extends JFrame{

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;

	private static Scanner sc;
	private static int intentos;
	private static String user, pass;
	

	public static void main(String[] args) {
		File ar = new File("usuarios.txt");
		if (!ar.exists()) {
			try{
				File archivo=new File("usuarios.txt");
				FileWriter escribir=new FileWriter(archivo,true);
				escribir.write("Master\r\n");
				escribir.write("1234\r\n");
				escribir.close();
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "ha Ocurrido un error al crear el archivo de usuarios" ,"ERROR", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
			}
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/Images/logo.png")));
		setTitle("CanoInc");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel PnlLogin = new JPanel();
		PnlLogin.setBackground(new Color(255, 255, 255));
		PnlLogin.setBounds(0, 0, 434, 261);
		contentPane.add(PnlLogin);
		PnlLogin.setLayout(null);
		
		JLabel LabelUsuario = new JLabel("Usuario");
		LabelUsuario.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		LabelUsuario.setBounds(125, 102, 78, 14);
		PnlLogin.add(LabelUsuario);
		
		JLabel LabelPass = new JLabel("Contraseña");
		LabelPass.setBounds(125, 143, 78, 14);
		PnlLogin.add(LabelPass);
		
		txtUser = new JTextField();
		txtUser.setToolTipText("Ingrese su nombre de usuario");
		txtUser.setBounds(205, 99, 86, 20);
		PnlLogin.add(txtUser);
		txtUser.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setToolTipText("Ingrese su contraseña");
		txtPass.setBounds(205, 140, 86, 20);
		PnlLogin.add(txtPass);
		
		JButton btnLogin = new JButton("Aceptar");
		btnLogin.setBounds(245, 195, 89, 23);
		btnLogin.addActionListener(e -> check());
		PnlLogin.add(btnLogin);
		
		JButton btnCancelLogin = new JButton("Cancelar");
		btnCancelLogin.setBounds(105, 195, 89, 23);
		btnCancelLogin.addActionListener(e -> System.exit(0));
		PnlLogin.add(btnCancelLogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(VentanaPrincipal.class.getResource("/Images/PandaHi.png")));
		lblNewLabel.setBounds(0, 4, 434, 84);
		PnlLogin.add(lblNewLabel);
		setLocationRelativeTo(null);
		
	}

	public void check() {
		FileReader fr = null;
		try {
			int nLineas=0;
			int i=0;
			String [] usuarios = null;
			String linea;
			
			sc = new Scanner(new File("usuarios.txt"));
			File f = new File("usuarios.txt");
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			try {
				while((linea=br.readLine())!= null) {
					nLineas++;
				}
			} catch (IOException ex) {
				Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			usuarios = new String[nLineas];//tamaño de arreglo usuarios
			
			while(sc.hasNextLine()) {
				usuarios[i++]=sc.nextLine();//almacenanado lineas en posiciones del arreglo
			}
			intentos++;
			user = txtUser.getText();
			pass = txtPass.getText();
			Segurity s = new Segurity();
			s.validarUsu(usuarios, user ,pass, intentos);
			
		} catch (FileNotFoundException ex) {
			Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
		} finally {
			try {
				fr.close();
			} catch (IOException ex) {
				Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
			}//close catch2
		}//close finally
		
		if(intentos==0) this.dispose();
	}//final method
	public static void setIntentos(int intentos) {
		VentanaPrincipal.intentos = intentos;
	}
	public static String getUser() {
		return user;
	}
}
