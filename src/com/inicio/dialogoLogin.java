package com.inicio;
//Aqui importamos los paquetes necesarios
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import com.clases.*;

//Aqui creamos el objeto del dialogo de login y extendemos de la clase padre que es JDialog
public class dialogoLogin extends JDialog{
	//Aqui declaramos las variables
	Constantes constantes;
	JButton aceptar,cancelar;
	JTextField usuario;
	JPasswordField password;
	JLabel loginImagen,usuarioImagen,passwordImagen;
	Image icono,iconUser,iconPassword;
	ImageIcon imagenIcon,imageIconUser,imageIconPassword;
	//Aqui declaramos el constructor de nuestra clase y definimos los valores por defecto
	public dialogoLogin(){
		//llamamos al metodo para inicializar la interfaz grafica
		constantes = new Constantes();
		inicializarComponentes();
	}
	//Aqui programamos lo que hara el boton de aceptar para que ingrese al sistema
	public void ingresar(){
			String[] parametros = {usuario.getText(),password.getText()};
			boolean ban = true;
			for(String parametro : parametros){
				if(parametro.isEmpty()){
					ban = false;
				}
			}
			if(ban){
				dispose();
			}else{
				JOptionPane.showMessageDialog(null,"Complete todos los datos por favor");
				usuario.setText("");
				password.setText("");
				usuario.requestFocus();
			}
	}
	public void inicializarComponentes(){
		//Aqui declaramos y anadimos la etiqueta de usuario
		usuarioImagen = new JLabel("Usuario");
		usuarioImagen.setBounds(50,150,50,50);
		iconUser = new ImageIcon(Object.class.getResource("../../imagenes/avatar.png")).getImage();
		imageIconUser = new ImageIcon(iconUser.getScaledInstance(usuarioImagen.getWidth(),usuarioImagen.getHeight(),Image.SCALE_SMOOTH));
		usuarioImagen.setIcon(imageIconUser);
		add(usuarioImagen);

		//Aqui declaramos y anadimos la etiqueta de la password
		passwordImagen = new JLabel("Password");
		passwordImagen.setBounds(50,250,50,50);
		iconPassword = new ImageIcon(Object.class.getResource("../../imagenes/bloquear.png")).getImage();
		imageIconPassword = new ImageIcon(iconPassword.getScaledInstance(passwordImagen.getWidth(),passwordImagen.getHeight(),Image.SCALE_SMOOTH));
		passwordImagen.setIcon(imageIconPassword);
		add(passwordImagen);

		//Aqui declaramos y anadimos el cuadro de texto para el usuario
		usuario = new JTextField();
		usuario.setBounds(150,150,120,30);
		add(usuario);
		//Aqui colocamos la imagen en el formulario
		loginImagen = new JLabel();
		loginImagen.setBounds(350,60,256,256);
		icono = new ImageIcon(Object.class.getResource("../../imagenes/security.png")).getImage();
		imagenIcon = new ImageIcon(icono.getScaledInstance(loginImagen.getWidth(),loginImagen.getHeight(),Image.SCALE_SMOOTH));
		loginImagen.setIcon(imagenIcon);
		add(loginImagen);
		//Aqui declaramos y anadimos el cuadro de texto para la password
		password = new JPasswordField();
		password.setBounds(150,250,120,30);
		add(password);

		//Aqui declaramos y anadimos el boton de aceptar
		aceptar = new JButton("Aceptar");
		aceptar.setBounds(50,320,100,30);
		add(aceptar);
		
		//Aqui declaramos y anadimos el boton de cancelar o salir 
		cancelar = new JButton("Cancelar");
		cancelar.setBounds(160,320,100,30);
		add(cancelar);
		//Aqui anadimos el evento del boton aceptar
		aceptar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ingresar();
			}
		});

		//Aqui anadimos el evento del boton cancelar 
		cancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int res = JOptionPane.showConfirmDialog(null,"Desea salir del sistema?","Salida",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(res == JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		});
		//Aqui definimos sus parametros iniciales para cuando de muestre en pantalla
		setLayout(null);
		setBounds(0,0,constantes.getWidth()/2,(constantes.getHeight()/2)+100);
		setTitle("Iniciar sesion");
		setLocationRelativeTo(null);
		setModalityType(JDialog.ModalityType.APPLICATION_MODAL);
		addWindowListener(new WindowAdapter(){
					@Override 
					public void windowClosing(WindowEvent evt){
						System.exit(0);					}
				});
		setVisible(true);

	}
} 