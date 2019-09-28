package com.formularios;
//Importamos los paquetes necesarios para nuestra interface 
import javax.swing.*;
import com.clases.*;
//Extendemos la clase de un JIntervalFrame 
public class Productos extends JInternalFrame{
	private static final long serialVersionUID = 1L;
	// Declaramos todas las variables a utilizar durante toda la interface
	JPanel panel;
	JLabel jlNombre,jlDescripcion,jlPrecio,jlCantidad,jlCategoria,jlIva,jlImagen,jlImageMostrar;
	JTextField txtNombre,txtPrecio,txtCantidad,txtIva;
	JTextArea txtDescripcion;
	JComboBox<String> txtCategoria;
	JButton btnRegistrar;
	Constantes constantes;
	//Escribimos el constructor vacio que realiza la configuracion inicial de la pantalla
	public Productos(){
		super("Productos",true,true,true,true);
		//llamamos al metodo inicializarComponentes();
		inicializarComponentes();
		constantes = new Constantes();
		setBounds(0,0,(constantes.getWidth()/2)+100,500);
		show();
	}
	//Aqui creamos el metodo que se utilizara para inicializar la interfaz grafica del jinternalframe
	private void inicializarComponentes(){
		panel = new JPanel();
		panel.setLayout(null);
		//Aqui creamos todos los labels del formulario
		jlNombre = new JLabel("Nombre");
		jlDescripcion = new JLabel("Descripcion");
		jlPrecio = new JLabel("Precio");
		jlCantidad = new JLabel("Cantidad");
		jlCategoria = new JLabel("Categoria");
		jlIva = new JLabel("IVA");
		jlImagen = new JLabel("Imagen");
		jlImageMostrar = new JLabel("imagen a mostrar");
		//Aqui creamos todos los cuadros de texto que utilizaremos durante todo el formulario
		txtNombre = new JTextField();
		txtDescripcion = new JTextArea();
		txtPrecio = new JTextField();
		txtCantidad = new JTextField();
		txtCategoria = new JComboBox<String>();
		txtIva = new JTextField();
		btnRegistrar = new JButton("Registrar");
		
		//Introducimos las etiquetas dentro del panel
		jlNombre.setBounds(50,50,80,30);
		jlDescripcion.setBounds(50,130,80,30);
		jlPrecio.setBounds(50,270,80,30);
		jlCantidad.setBounds(50,350,80,30);
		jlCategoria.setBounds(420,50,150,30);
		jlIva.setBounds(420,130,150,30);
		jlImagen.setBounds(420,210,150,30);
		jlImageMostrar.setBounds(550,210,64,64);
		panel.add(jlNombre);
		panel.add(jlDescripcion);
		panel.add(jlPrecio);
		panel.add(jlCantidad);
		panel.add(jlCategoria);
		panel.add(jlIva);
		panel.add(jlImagen);
		panel.add(jlImageMostrar);
		//Introducimos los cuadros de texto dentro del panel
		txtNombre.setBounds(180,50,150,30);
		txtDescripcion.setBounds(180,130,150,90);
		txtPrecio.setBounds(180,270,150,30);
		txtCantidad.setBounds(180,350,150,30);
		txtCategoria.setBounds(550,50,150,30);
		txtIva.setBounds(550,130,150,30);
		panel.add(txtNombre);
		panel.add(txtDescripcion);
		panel.add(txtPrecio);
		panel.add(txtCantidad);
		panel.add(txtCategoria);
		panel.add(txtIva);
		//Introducimos el boton de registrar dentro del panel
		btnRegistrar.setBounds(500,500,90,30);
		panel.add(btnRegistrar);
		//Guardamos el panel dentro de la interfaz base
		getContentPane().add(panel);
	}
}