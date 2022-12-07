package Pack;

import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JLabel lblImg;
	private JTextField txtProducto;
	private JTextField txtStock;
	private JTextField txtPrecio;
	private boolean ch;
	private int filaSeleccionada = -1;
	
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
	FileOutputStream fos2 = null;
	ObjectOutputStream oos2 = null;
	
	FileInputStream fis = null;
	ObjectInputStream ois = null;
	FileInputStream fis2 = null;
	ObjectInputStream ois2 = null;
	
	String[] columnNames = {"Nombre","Stock","Precio"};
	String[] columnNames2 = {"Nombre","Stock","Precio","Monto"};
	
	DefaultTableModel dtm = new DefaultTableModel(null, columnNames);
	DefaultTableModel dtm2 = new DefaultTableModel(null, columnNames2);
	
	ArrayList<Producto> productos = new ArrayList<Producto>();
	ArrayList<Producto> historial = new ArrayList<Producto>();
	
	private JTable table;
	private JTextField txtNombreS;
	private JTextField txtStockS;
	private JTextField txtPrecioS;
	private JTable tableVentas;
	//Producto producto;

			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	public Menu() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Menu.class.getResource("/Images/logo.png")));
		setTitle("CanoInc");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 484, 321);
		contentPane.add(tabbedPane);
		//Panel Bienvenida
		JPanel pnlBienvenida = new JPanel();
		tabbedPane.addTab("Bienvenida", null, pnlBienvenida, null);
		VentanaPrincipal m = new VentanaPrincipal();
		pnlBienvenida.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido "+m.getUser());
		lblNewLabel.setBounds(173, 11, 252, 14);
		pnlBienvenida.add(lblNewLabel);
		
		JTextArea txtBienvenido = new JTextArea();
		txtBienvenido.setBackground(new Color(0,0,0,10));
		txtBienvenido.setLineWrap(true);
		txtBienvenido.setWrapStyleWord(true);
		txtBienvenido.setText("Bienvenido al programa de Ventas donde podras agregar productos "
				+ "y venderlos a tu gusto, en este programa podras agregar productos "
				+ "de los cuales te pedira un nombre, precio, y stock disponible, tambien "
				+ "te agregara la opcion de vender los productos, donde te guardara el "
				+ "historial de ventas que tuviste a lo largo del uso del programa.\n\n"
				+ "Programa desarrollado por: Erick Cano\n"
				+ "Disponible en Github: user:ErickCano01");
		txtBienvenido.setOpaque(false);
		txtBienvenido.setEditable(false);
		txtBienvenido.setBounds(0, 47, 479, 177);
		pnlBienvenida.add(txtBienvenido);
		
		lblImg = new JLabel("");
		lblImg.setBounds(200, 178, 87, 90);
		ImageIcon ico = new ImageIcon(getClass().getResource("/Images/conejo.png"));
		ImageIcon img = new ImageIcon(ico.getImage().getScaledInstance(lblImg.getWidth(), lblImg.getHeight(), Image.SCALE_SMOOTH));
		lblImg.setIcon(img);
		pnlBienvenida.add(lblImg);
		//Fin Panel Bienvenida
		
		//Panel Productos
		JPanel pnlProductos = new JPanel();
		tabbedPane.addTab("Productos", null, pnlProductos, null);
		pnlProductos.setLayout(null);
		
		JButton btnVender = new JButton("Vender");
		btnVender.setBounds(368, 90, 101, 23);
		btnVender.addActionListener(e -> vender());
		pnlProductos.add(btnVender);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 123, 479, 170);
		pnlProductos.add(scrollPane);
		
		table = new JTable(dtm);
		scrollPane.setViewportView(table);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(368, 26, 101, 23);
		btnBuscar.addActionListener(e -> SelectRow());
		pnlProductos.add(btnBuscar);
		
		txtNombreS = new JTextField();
		txtNombreS.setBounds(79, 26, 86, 20);
		pnlProductos.add(txtNombreS);
		txtNombreS.setColumns(10);
		
		txtStockS = new JTextField();
		txtStockS.setBounds(79, 57, 86, 20);
		pnlProductos.add(txtStockS);
		txtStockS.setColumns(10);
		
		txtPrecioS = new JTextField();
		txtPrecioS.setBounds(79, 88, 86, 20);
		pnlProductos.add(txtPrecioS);
		txtPrecioS.setColumns(10);
		
		JLabel lblNombreS = new JLabel("Nombre");
		lblNombreS.setBounds(23, 29, 46, 14);
		pnlProductos.add(lblNombreS);
		
		JLabel lblStockS = new JLabel("Stock");
		lblStockS.setBounds(23, 60, 46, 14);
		pnlProductos.add(lblStockS);
		
		JLabel lblPrecioS = new JLabel("Precio");
		lblPrecioS.setBounds(23, 91, 46, 14);
		pnlProductos.add(lblPrecioS);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(368, 56, 101, 23);
		btnActualizar.addActionListener(e -> UpdateS());
		pnlProductos.add(btnActualizar);
		
		JLabel lblImg3 = new JLabel("");
		lblImg3.setBounds(204, 11, 120, 97);
		ImageIcon ico3 = new ImageIcon(getClass().getResource("/Images/lupa.png"));
		ImageIcon img3 = new ImageIcon(ico3.getImage().getScaledInstance(lblImg3.getWidth(), lblImg3.getHeight(), Image.SCALE_SMOOTH));
		lblImg3.setIcon(img3);
		pnlProductos.add(lblImg3);
		//fin Panel Productos
		
		//Panel Agregar
		JPanel pnlAgregar = new JPanel();
		tabbedPane.addTab("Agregar Productos", null, pnlAgregar, null);
		pnlAgregar.setLayout(null);
		
		txtProducto = new JTextField();
		txtProducto.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtProducto.setBounds(96, 57, 115, 25);
		pnlAgregar.add(txtProducto);
		txtProducto.setColumns(10);
		
		txtStock = new JTextField();
		txtStock.setBounds(96, 93, 115, 25);
		pnlAgregar.add(txtStock);
		txtStock.setColumns(10);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(96, 129, 115, 25);
		pnlAgregar.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNombre.setBounds(26, 57, 72, 25);
		pnlAgregar.add(lblNombre);
		
		JLabel lblCantidad = new JLabel("Stock");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCantidad.setBounds(26, 93, 72, 25);
		pnlAgregar.add(lblCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPrecio.setBounds(26, 129, 72, 25);
		pnlAgregar.add(lblPrecio);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnGuardar.setBounds(128, 201, 111, 27);
		btnGuardar.addActionListener(e -> check());
		pnlAgregar.add(btnGuardar);
		
		JLabel lblImagenA = new JLabel("");
		lblImagenA.setBounds(228, 16, 196, 178);
		ImageIcon ico2 = new ImageIcon(getClass().getResource("/Images/calidad.png"));
		ImageIcon img2 = new ImageIcon(ico2.getImage().getScaledInstance(lblImagenA.getWidth(), lblImagenA.getHeight(), Image.SCALE_SMOOTH));
		lblImagenA.setIcon(img2);
		pnlAgregar.add(lblImagenA);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancelar.setBounds(10, 201, 108, 27);
		btnCancelar.addActionListener(e -> clear());
		pnlAgregar.add(btnCancelar);
		
		JLabel lblRegistro = new JLabel("Registro de Productos");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRegistro.setBounds(26, 16, 185, 30);
		pnlAgregar.add(lblRegistro);
		//Fin Panel Agregar
		
		//Panel Vender
		JPanel pnlHistorialVentas = new JPanel();
		tabbedPane.addTab("Ventas", null, pnlHistorialVentas, null);
		pnlHistorialVentas.setLayout(null);
		
		JScrollPane scrollPane2 = new JScrollPane();
		scrollPane2.setBounds(0, 0, 479, 244);
		pnlHistorialVentas.add(scrollPane2);
		
		tableVentas = new JTable(dtm2);
		tableVentas.setEnabled(false);
		scrollPane2.setViewportView(tableVentas);
		
		//Fin Panel Vender
		
		setLocationRelativeTo(null);
		mostrar();
		mostrar2();
	}
	public void UpdateS() {
		if(filaSeleccionada != -1) {
			int[] selectedRows = table.getSelectedRows();
			for(int i = 0; i<selectedRows.length;i++) {
				for(int j = 0; j<productos.size();j++) {
					Producto p = productos.get(j);
					if(p.getNombre() == table.getValueAt(selectedRows[i], 0)){
						productos.remove(j);
						guardar(txtNombreS.getText(),Integer.parseInt(txtStockS.getText()),Float.parseFloat(txtPrecioS.getText()));
						clear2();
					}
				}
			}
			filaSeleccionada = -1;
		}else {
			JOptionPane.showMessageDialog(null,"Error: No se ha Seleccionado ningun Objeto","ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void SelectRow() {
		filaSeleccionada = table.getSelectedRow();
		if(filaSeleccionada != -1) {
			txtNombreS.setText(table.getValueAt(filaSeleccionada,0).toString());
			txtStockS.setText(table.getValueAt(filaSeleccionada,1).toString());
			txtPrecioS.setText(table.getValueAt(filaSeleccionada,2).toString());
		}else {
			JOptionPane.showMessageDialog(null,"Error: No se ha Seleccionado ningun Objeto","ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void guardar(String nombre, int stock, float precio) {
		try {
			fos = new FileOutputStream("Productos.dat");
			oos = new ObjectOutputStream(fos);
			
			Producto producto = new Producto();
			producto.setNombre(nombre);
			producto.setStock(stock);
			producto.setPrecio(precio);
			productos.add(producto);
			clear();
			oos.writeObject(productos);
			refreshTable();
			//producto = new Producto(nombre, stock, precio);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos !=null) {
					fos.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	public void mostrar() {
		try {
			fis = new FileInputStream("productos.dat");
			ois = new ObjectInputStream(fis);
			
			while(fis.available() > 0) {
				productos =(ArrayList<Producto>) ois.readObject();
				refreshTable();	
			}
		}catch(FileNotFoundException e) {
			System.out.println("\nFichero Creado");
		}catch(IOException e) {
			System.out.println("\nERROR: No se puede acceder al fichero");
		}catch(ClassNotFoundException e) {
			System.out.println("\nERROR: No se encuentra la clase");
		}finally {
			try {
				if(fis != null) {
					fis.close();
				}
			}catch(IOException e) {
				System.out.println("\nERROR: No se ha podido cerrar el fichero");
			}
		}
	}
	public void refreshTable() {
		while(dtm.getRowCount()>0) {
			dtm.removeRow(0);
		}
		for(Producto producto : productos) {
			Object p[] = new Object[3];
			p[0]=producto.getNombre();
			p[1]=producto.getStock();
			p[2]=producto.getPrecio();
			dtm.addRow(p);
		}
		table.setModel(dtm);
	}
	public void refreshTable2() {
		while(dtm2.getRowCount()>0) {
			dtm2.removeRow(0);
		}
		for(Producto ventas : historial) {
			Object v[] = new Object[4];
			v[0]=ventas.getNombre();
			v[1]=ventas.getStock();
			v[2]=ventas.getPrecio();
			v[3]=ventas.getDinero();
			dtm2.addRow(v);
		}
		tableVentas.setModel(dtm2);
	}
	public void check() {
		if (txtProducto.getText().equals("") || txtStock.getText().equals("") || txtPrecio.getText().equals("")) {
			JOptionPane.showMessageDialog(null,"Error: Campos Vacios","ERROR", JOptionPane.ERROR_MESSAGE);
		}else {
			mostrar();
			for(int i = 0; i < productos.size();i++) {
				if(txtProducto.getText().equalsIgnoreCase(productos.get(i).getNombre())) {
					ch=true;
				}
			}
			if(ch==false) {
				guardar(txtProducto.getText(),Integer.parseInt(txtStock.getText()),Float.parseFloat(txtPrecio.getText()));
			}else {
				clear();
				JOptionPane.showMessageDialog(null,"ERROR: Ya hay un producto con el mismo nombre","ERROR", JOptionPane.ERROR_MESSAGE);
				ch=false;
			}
		}
	}
	public void clear() {
		txtProducto.setText("");
		txtStock.setText("");
		txtPrecio.setText("");
	}
	public void clear2() {
		txtNombreS.setText("");
		txtStockS.setText("");
		txtPrecioS.setText("");
	}
	public void vender() {
		if(filaSeleccionada != -1) {
			int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantos "+table.getValueAt(filaSeleccionada,0).toString()+" quieres vender?"));
			int s = Integer.parseInt(table.getValueAt(filaSeleccionada,1).toString());
			if(a<=s) {
				s = s-a;
				float b = Float.parseFloat(table.getValueAt(filaSeleccionada,2).toString());
				String t = table.getValueAt(filaSeleccionada,0).toString();
				txtStockS.setText(s+"");
				historial(t,a, b);
				UpdateS();
			}else {
				JOptionPane.showMessageDialog(null,"Error: No se ha Seleccionado ningun objeto para vender","ERROR", JOptionPane.ERROR_MESSAGE);
				clear2();
			}
			filaSeleccionada=-1;
		}else {
			JOptionPane.showMessageDialog(null,"Error: No se ha Seleccionado ningun objeto para vender","ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	public void historial(String nombre, int sold, float precio) {
		try {
			fos2 = new FileOutputStream("ventas.dat");
			oos2 = new ObjectOutputStream(fos2);
			
			Producto ventas = new Producto();
			
			float dinero = sold*precio;
			ventas.setNombre(nombre);
			ventas.setStock(sold);
			ventas.setPrecio(precio);
			ventas.setDinero(dinero);
			historial.add(ventas);
			
			oos2.writeObject(historial);
			refreshTable2();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos2 !=null) {
					fos2.close();
				}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	public void mostrar2() {
		try {
			fis2 = new FileInputStream("ventas.dat");
			ois2 = new ObjectInputStream(fis2);
			
			while(fis2.available() > 0) {
				historial =(ArrayList<Producto>) ois2.readObject();
				refreshTable2();	
			}
		}catch(FileNotFoundException e) {
		}catch(IOException e) {
			System.out.println("\nERROR: No se puede acceder al fichero");
		}catch(ClassNotFoundException e) {
			System.out.println("\nERROR: No se encuentra la clase");
		}finally {
			try {
				if(fis2 != null) {
					fis2.close();
				}
			}catch(IOException e) {
				System.out.println("\nERROR: No se ha podido cerrar el fichero");
			}
		}
	}
}
