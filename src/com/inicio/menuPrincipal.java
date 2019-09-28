package com.inicio;
import com.formularios.*;
import javax.swing.*;
import com.inicio.Escritorio;
import java.awt.event.*;
import com.clases.*;
public class menuPrincipal extends JFrame{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	// Aqui definimos las variables globales de nuestra interface
	JMenu proveedores,clientes,stock,factura,empleados;
	JDialog dialogo;
	JMenuItem formProveedor,formFactura,formClientes,formStock,formEmpleados;
	JMenuBar barraMenu;
	Constantes constantes;
	Proveedores proveedoresFormulario;
	//Aqui definimos el constructor para nuestra clase
	public menuPrincipal(){
		constantes = new Constantes();
		//Aqui creamos la barra del menu
		barraMenu = new JMenuBar();
		//Aqui creamos los menus
		proveedores = new JMenu("Proveedores");
		factura = new JMenu("Facturacion");
		clientes = new JMenu("Clientes");
		stock = new JMenu("Stock");
		empleados = new JMenu("Empleados");
		//Aqui creamos los submenus 
		formProveedor = new JMenuItem("Formulario_Proveedor");
		formFactura = new JMenuItem("Formulario_Factura");
		formClientes = new JMenuItem("Formulario_Clientes");
		formStock = new JMenuItem("Formulario_Stock");
		formEmpleados = new JMenuItem("Formulario_Empleados");
		//Agreagamos los submenus con sus respectivos menus
		proveedores.add(formProveedor);
		factura.add(formFactura);
		clientes.add(formClientes);
		stock.add(formStock);
		empleados.add(formEmpleados);
		//Agregamos a la barra del menu
		barraMenu.add(proveedores);
		barraMenu.add(clientes);
		barraMenu.add(factura);
		barraMenu.add(stock);
		barraMenu.add(empleados);
		//Aqui agreagamos el objeto de escritorio en nuestro sistema
		JDesktopPane escritorio = new Escritorio();
		getContentPane().add(escritorio);
		
		//Aqui agregamos la accion del menu 
		formProveedor.addActionListener((java.awt.event.ActionEvent ex)->{
			escritorio.add(new Proveedores());
		});
		formStock.addActionListener((java.awt.event.ActionEvent ex)->{
			escritorio.add(new Productos());	
		});
		//Creamos el evento del boton del menu salir

		//Creamos eel vento del boton del menu item alumno 
		
		//Aqui agreganos el evento de ventana para el login de usuarios
		addWindowListener(new WindowAdapter(){
			public void windowOpened(WindowEvent e){
				//Aqui instanciamos la clase del dialogo del login de usuarios 
				new dialogoLogin();
				
			}
		});
		//Aqui definimos el tipo de apariencia que tendra nuestra interfaz grafica
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception ex){
			ex.printStackTrace();
		}

		//Aqui definimos el menu que utilizaremos en nuestro formulario
		setJMenuBar(barraMenu);
		setTitle("Bienvenido al sistema");
		setBounds(0,0,constantes.getWidth(),constantes.getHeight());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args){
		//Aqui iniciamos la interfaz grafica
		new menuPrincipal();
	}	
}